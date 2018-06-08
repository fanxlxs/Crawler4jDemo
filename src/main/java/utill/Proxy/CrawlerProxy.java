package utill.Proxy;

import org.jsoup.Jsoup;
import utill.musicutil.HttpUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fxl
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018-06-0811:01
 */
public class CrawlerProxy implements PatternStr {


    public static void main(String[] args) {
        //抓取ip代理网站
        crawlerWangNeng(10);
    }


    public static void crawlerWangNeng(int page){
        List<String> ipResult = new ArrayList<String>();
        for (int i=0;i<10;i++){
            String url = "http://www.wndaili.cn/?page="+i;
            String resu = HttpUtil.requestUrl(url);
            ipResult.add(resu);
        }
        circulation(ipResult,WANGNENGRULE);
    }

    /**
     * 获取ip66代理
     */
    public static void  crawlerip66(int page){
        List<String> ipResult = new ArrayList<String>();
        for (int i = 2;i<page;i++) {
            String url ="http://www.66ip.cn/"+i+".html";
            System.out.println(url);
            String ip66Result = HttpUtil.requestIp66(url);
            ipResult.add(ip66Result);
        }
        circulation(ipResult,IP66RULE);
    }

    /**
     * 循环处理带有分页的文本
     */
    public static void circulation (List<String> list,String partten){
        for(int i = 0;i<list.size();i++){
            System.out.println("分页"+i);
            disposeResult(list.get(i),partten);
        }
    }

    /**
     * 将下载的结果通过正则表达式进行解析，并检测该代理是否可用
     * @todo 待将数据入库
     * @param ip66Result
     */
    public static void disposeResult (String ip66Result,String pattern) {
        long startTime = System.currentTimeMillis();//记录开始时间
       // String pattern = "<td>(\\d{1,3}.\\d{0,3}.\\d{0,3}.\\d{0,3})</td><td>(\\d{1,5})</td>";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(ip66Result);
        Map<String, String> ipMap = new HashMap<String, String>();
        for (int i = 0; i < 12; i++) {
            if (m.find()) {
                System.out.println(m.group(1) + "===============" + m.group(2));
                Boolean b = checkProxy(m.group(1), Integer.parseInt(m.group(2)));
                if (b) {
                    ipMap.put(m.group(1), m.group(2));
                    System.out.println("该ip地址可用ip地址为" + m.group(1) + "端口为" + (m.group(2)));
                } else {
                    System.out.println("该ip无效");
                }
            } else {
                System.out.println("系统错误，请联系管理员");
            }
            long endTime = System.currentTimeMillis();//记录结束时间
            float excTime = (float) (endTime - startTime) / 1000;
            System.out.println("执行时间：" + excTime + "s");
        }
    }



    //检查代理地址是否可用
    private static boolean checkProxy(String ip, Integer port) {
        try {
            Jsoup.connect("https://www.baidu.com")
                    .timeout(10 * 1000)
                    .proxy(ip, port)
                    .get();
            return true;
        } catch (Exception e) {
            return false;
        }
    }



}
