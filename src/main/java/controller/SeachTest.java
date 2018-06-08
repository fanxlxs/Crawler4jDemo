package controller;

import org.apache.http.HttpEntity;
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
 * @date 2018-05-3116:34
 */
public class SeachTest {

    public static void main(String[] args) {
        CloseableHttpClient httpCilent = HttpClients.createDefault();//Creates CloseableHttpClient instance with default configuration.
        //设置请求地址
        HttpGet httpGet = new HttpGet("http://www.kugou.com/yy/html/search.html#searchType=song&searchKeyWord=普通disco");
        try {
            //发送请求
            CloseableHttpResponse response =httpCilent.execute(httpGet);
            //获取返回的实体
            HttpEntity entity = response.getEntity();
            //输出请求相应信息
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println("输出结果:+++++++++++++++"+result);
            System.out.println("2");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                httpCilent.close();//释放资源
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    }
}
