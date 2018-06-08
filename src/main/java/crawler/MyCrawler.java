package crawler;

import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.parser.HtmlParseData;
import edu.uci.ics.crawler4j.url.WebURL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.regex.Pattern;

public class MyCrawler extends WebCrawler {

    private static int count = 0;
    private final static Pattern FILTERS = Pattern.compile(".*(\\.(css|js|gif|jpg"
            + "|png|mp3|mp4|zip|gz|text|html))$");

    /**
     * This method receives two parameters. The first parameter is the page
     * in which we have discovered this new url and the second parameter is
     * the new url. You should implement this function to specify whether
     * the given url should be crawled or not (based on your crawling logic).
     * In this example, we are instructing the crawler to ignore urls that
     * have css, js, git, ... extensions and to only accept urls that start
     * with "http://www.ics.uci.edu/". In this case, we didn't need the
     * referringPage parameter to make the decision.
     */
    @Override
    public boolean shouldVisit(Page referringPage, WebURL url) {
        String href = url.getURL().toLowerCase();
       return href.startsWith("https://www.xiami.com/song/");
    }

    /**
     * This function is called when a page is fetched and ready
     * to be processed by your program.
     */
    @Override
    public void visit(Page page) {

        String url = page.getWebURL().getURL();
        String parentUrl = page.getWebURL().getParentUrl();
        String anchor = page.getWebURL().getAnchor();
        System.out.println("URL        :" + url);
        System.out.println("Parent page:" + parentUrl);
        System.out.println("Anchor text:" + anchor);
        if (page.getParseData() instanceof HtmlParseData) {
            HtmlParseData htmlParseData = (HtmlParseData) page.getParseData();
            String html = htmlParseData.getHtml();
            System.out.println(html);
            Document document = Jsoup.parse(html);
            System.out.println("下载网页完成");
            //获取class为jspPane的元素
            //Elements content = document.getElementsByClass("js_song");
            Elements content =  document.getElementsByAttributeValueMatching("href", "href=");
            System.out.println("获取元素js_song"+"content.size"+content.size());
            //遍历这个集合
            for(int i=0;i<content.size();i++){
                Element element=content.get(i);
               String string =  element.ownText();
                System.out.println(string);
            }
        }
    }
}