package controller;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018-05-3115:09
 */
public class HttpTest {
    public static void main(String[] args) {
        try {
            String result = HttpTest.getSerchResult("如果有来生");
            System.out.println("输出结果:+++++++++++++++"+result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static String getSerchResult(String musicName) throws IOException {

        //拼接歌曲url
        String title = "http://songsearch.kugou.com/song_search_v2?callback=jQuery112405213552049562944_1505739248953&keyword=";
        String end ="&page=1&pagesize=30&userid=-1";
        String url=title+musicName+end;

        CloseableHttpClient httpCilent = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        //发送请求
        CloseableHttpResponse response =httpCilent.execute(httpGet);
        //获取返回的实体
        HttpEntity entity = response.getEntity();
        //输出请求相应信息
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        return result;
    }

    public static Map analysisSerchResult (String result){


        Map<String,String> hashMap = new HashMap<String, String>();


        return null;
    }



}