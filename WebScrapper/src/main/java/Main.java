import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://www.channelnewsasia.com/news/topic/stock-market";
        Crawl crawl = new Crawl();
        crawl.getWords(url);

        Page page = new Page();
        System.out.println(page.getNextUrl(url));


    }
}

/*get the titles. get the next button line. replace it as url. repeat. */
