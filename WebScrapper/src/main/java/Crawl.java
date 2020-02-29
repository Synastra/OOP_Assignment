import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Crawl {

    public Crawl()
    {

    }

    public void getWords(String url)
    {


        try
        {
            Document doc = Jsoup.connect(url).get();
            //System.out.println(doc.outerHtml());
            for (Element row : doc.select("h3.teaser__heading"))
            {
                System.out.println(row.select("a.teaser__title"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
