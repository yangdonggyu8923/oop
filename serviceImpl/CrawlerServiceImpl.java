package serviceImpl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import service.CrawlerService;


import java.io.IOException;
import java.util.List;

public class CrawlerServiceImpl implements CrawlerService {

    @Override
    public List<?> findNamesFromWeb() throws IOException {
        Document doc = Jsoup.connect("웹 데이터를 가져올 주소").get();
        return null;
    }
}