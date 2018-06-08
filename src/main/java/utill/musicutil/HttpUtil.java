package utill.musicutil;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018-06-0516:08
 */
public class HttpUtil {

    //请求地址获取result
    public static String requestUrl(String url){
        CloseableHttpClient httpCilent = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        String result = null;
        //发送请求
        CloseableHttpResponse response = null;
        try {
            response = httpCilent.execute(httpGet);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(response.getEntity(), "gb2312");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    //请求地址获取result
    public static String requestUrl(String url,String ip,Integer port){
        HttpHost proxy = new HttpHost(ip, port, "http");
        //把代理设置到请求配置
        RequestConfig defaut = RequestConfig.custom()
                .setProxy(proxy)
                .build();
        CloseableHttpClient httpCilent = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        //发送请求
        CloseableHttpResponse response = null;
        try {
            response = httpCilent.execute(httpGet);
            HttpEntity entity = response.getEntity();
            return EntityUtils.toString(response.getEntity(), "gb2312");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 请求ip66用于获取代理ip
     * @param url
     * @return
     */
    public static String requestIp66(String url){
        CloseableHttpClient httpCilent = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        //设置ip66hanler
        httpGet.setHeader("Host","www.66ip.cn");
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:60.0) Gecko/20100101 Firefox/60.0");
        httpGet.setHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        httpGet.setHeader("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3");
        httpGet.setHeader("Accept-Encoding","gzip, deflate");
        httpGet.setHeader("Cookie","yd_cookie=66b8c7c1-fb3e-412dd26402c0e3ae86975d431ddc6eaa3fe3; UM_distinctid=163dd2a2e1f94f-02c97a7c2196e08-4c312a7a-13c680-163dd2a2e21a0c; CNZZDATA1253901093=735089301-1528423852-null%7C1528442430; Hm_lvt_1761fabf3c988e7f04bec51acd4073f4=1528423919; Hm_lpvt_1761fabf3c988e7f04bec51acd4073f4=1528443483");
        httpGet.setHeader("Connection","keep-alive");
        httpGet.setHeader("Upgrade-Insecure-Requests","1");
        httpGet.setHeader("Cache-Control","max-age=0");


        String result = null;
        //发送请求
        CloseableHttpResponse response = null;
        try {
            response = httpCilent.execute(httpGet);
            HttpEntity entity = response.getEntity();
            result = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
