package utill.musicutil;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018-06-0510:28
 */
public class QQUtil {
    public static void main(String[] args) {
     // String result = requestUrl("http://u.y.qq.com/cgi-bin/musicu.fcg");
       // String url= "http://c.y.qq.com/soso/fcgi-bin/client_search_cp?ct=24&qqmusic_ver=1298&new_json=1&remoteplace=txt.yqq.song&searchid=61143257542849990&t=0&aggr=1&cr=1&catZhida=1&lossless=0&flag_qc=0&p=2&n=400&w=讲真的&g_tk=5381&jsonpCallback=MusicJsonCallback9341103988440519&loginUin=0&hostUin=0&format=jsonp&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0%20HTTP/1.1";


        String url="http://c.y.qq.com//soso/fcgi-bin/client_search_cp?ct=24&qqmusic_ver=1298&new_json=1&remoteplace=txt.yqq.center&searchid=37106833849611932&t=0&aggr=1&cr=1&catZhida=1&lossless=0&flag_qc=0&p=1&n=400&w=讲真的&g_tk=5381&jsonpCallback=MusicJsonCallback2879392598870377&loginUin=0&hostUin=0&format=jsonp&inCharset=utf8&outCharset=utf-8&notice=0&platform=yqq&needNewCode=0%20HTTP/1.1";
        String listStr= getSongList(url);
        System.out.println(listStr+"stttt");
        JSONObject jsonObject = resToJson(listStr);
        List<QQEntity> musicCount = getMusicCount(jsonObject);
        List<String> lrcUrl = getlrcylUrl(musicCount);
        getAllLrc(lrcUrl);
    }

    //获取QQ音乐列表数据
    public static String getSongList(String url){
        String result = HttpUtil.requestUrl(url);
        return result;
    }

    //将获取的结果进行去掉无用部分并转换为json
    public static JSONObject resToJson(String result){
        String res= result.substring(result.indexOf("{"),result.lastIndexOf("}")+1);
        //将数据转换为json格式的数据
        JSONObject json=JSONObject.parseObject(res);
        return json;
    }

    //获取全部歌曲信息
    public static List<QQEntity> getMusicCount(JSONObject jsonObject){
        JSONObject element =(JSONObject)jsonObject.get("data");
        JSONObject song = (JSONObject)element.get("song");
        System.out.println(song.toJSONString());
        JSONArray jsonArray = song.getJSONArray("list");
        List<QQEntity> result= JSON.parseArray(jsonArray.toJSONString(),QQEntity.class);
        return result ;
    }

    public static List<String> getlrcylUrl(List<QQEntity> list){
        List<String> lrcUrl= new ArrayList<String>();
        for(int i=0;i<list.size();i++){
            String id = list.get(i).getId();
            String str="{\"comm\":{\"g_tk\": 5381,\"uin\": 0,\"format\":\"json\",\"inCharset\":\"utf-8\", \"outCharset\": \"utf-8\",\"notice\": 0, \"platform\": \"h5\", \"needNewCode\": 1 }, \"song_detail\": { \"module\": \"music.pf_song_detail_svr\", \"method\": \"get_song_detail\", \"param\": { \"song_id\":"+ id+" } } }";
            String handler = "https://y.qq.com/m/client/v5detail/songDetail.html?songid="+id+"&_hidehd=1";
            String result=str+"|"+handler;
            lrcUrl.add(result);
        }
           return lrcUrl;
    }


    //获取歌词
    public static String requestUrl(String data,String handler){
        String url="http://u.y.qq.com/cgi-bin/musicu.fcg";
        HttpPost post= new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        try {
            StringEntity entity = new StringEntity(data,"utf-8");
            post.setEntity(entity);
            post.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:60.0) Gecko/20100101 Firefox/60.0");
            post.setHeader("Accept","application/json");
            post.setHeader("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
            post.setHeader("Content-Type","application/x-www-form-urlencoded");
            //post.setHeader("Content-Length","261");
            post.setHeader("Origin","https://y.qq.com");
            post.setHeader("Cookie","pgv_pvid=1516591415; pac_uid=0_5ab0b7ff145c8; pgv_pvi=2409516032; pt2gguin=o1406075864; RK=MRTBLlRRe7; ptcz=0e3a3a039275686e0c0d11209892d5d71ca7a8200fb22e58ffe4c7643963fda4; tvfe_boss_uuid=04d3c5800e3a4120; o_cookie=1406075864; ts_uid=3753389328; yq_index=0; ts_refer=ADTAGh5_playsong; yqq_stat=0; pgv_info=ssid=s7500964328; pgv_si=s8790081536");
            post.setHeader("Connection","keep-alive");
            post.setHeader("Cache-Contro","max-age=0");
            post.setHeader("Host","u.y.qq.com");
            //post.setHeader("Refere","https://y.qq.com/m/client/v5detail/songDetail.html?songid=213993442&_hidehd=1");
            post.setHeader("Refere",handler);
            HttpResponse resp = client.execute(post);
            //Thread.sleep(10000);
            if(resp.getStatusLine().getStatusCode() == 200) {
                HttpEntity he = resp.getEntity();
                String result = EntityUtils.toString(he, "UTF-8");
                System.out.println("result"+result);
                return result;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "内部错误，请联系管理员";
    }

    //循环获取歌词
    public static void getAllLrc(List<String> string){
        for(int i=0;i<string.size();i++){
            //根据,进行分割 data,handler
            String[] data= string.get(i).split("\\|");
            String lrc = requestUrl(data[0],data[1]);
            System.out.println("lrc"+lrc);
        }
    }
    //获取歌词





    }



