import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class main{

    private static Document getPage(String url) throws IOException {

        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    private static Document getPageFromFile(String url, String file) throws IOException {

        Document page = Jsoup.parse(new File(file), "utf-8", url);
        return page;
    }
    public static void main(String[] args) throws IOException {
        String url = "https://dark-store.su/";
        System.out.println(getPage(url));

    }
}
