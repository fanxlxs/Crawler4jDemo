package controller;


import crawler.MyCrawler;
import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicHeader;

import java.util.HashSet;

public class Controller {

    private static CloseableHttpClient httpClient = null;

    public static void main(String[] args) throws Exception {
        String crawlStorageFolder = "G:/haha";
        int numberOfCrawlers = 7;

        CrawlConfig config = new CrawlConfig();

        config.setFollowRedirects(false);
        config.setPolitenessDelay(2000);
        config.setCrawlStorageFolder(crawlStorageFolder);

        HashSet<BasicHeader> collections = new HashSet<BasicHeader>();
        collections.add(new BasicHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:60.0) Gecko/20100101 Firefox/60.0"));
        collections.add(new BasicHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"));
        collections.add(new BasicHeader("Accept-Encoding", "gzip, deflate, br"));
        collections.add(new BasicHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3"));
        collections.add(new BasicHeader("Connection", "keep-alive"));
        collections.add(new BasicHeader("Upgrade-Insecure-Requests", "1"));
        collections.add(new BasicHeader("Cache-Control", "max-age=0"));
        collections.add(new BasicHeader("Host", "www.xiami.com"));
        collections.add(new BasicHeader("Cookie", "gid=152833618354828; join_from=1zufSNtP6D010%2FjCCA; _xiamitoken=90026c179dbd332e9734563cd028b65c; _unsign_token=00bd276f06bff1a49fd87485bcb264e4; user_from=1; UM_distinctid=163d7eefb3158-0445158b4001b68-4c312a7a-13c680-163d7eefb3227e; CNZZDATA921634=cnzz_eid%3D1035465944-1528335070-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1528335070; CNZZDATA2629111=cnzz_eid%3D817661669-1528332831-https%253A%252F%252Fwww.baidu.com%252F%26ntime%3D1528332831; cna=gS4xE3E/4nQCAWp5O2GfdyrC; isg=BPb2HQAMsVkt40W9H1R2Y4myRC84v_KXeK1u1mDf4ll0o5Y9yKeKYVxzv__PEDJp"));
        config.setDefaultHeaders(collections);

        PageFetcher pageFetcher = new PageFetcher(config);
        RobotstxtConfig robotstxtConfig = new RobotstxtConfig();
        RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher);

        CrawlController controller = new CrawlController(config, pageFetcher, robotstxtServer);
        System.out.println("开始设置爬虫种子");
        controller.addSeed("https://www.xiami.com/search?key=%E8%AE%B2%E7%9C%9F%E7%9A%84&pos=1");
        System.out.println("设置种子一完成");
        controller.start(MyCrawler.class, numberOfCrawlers);


    }
}
