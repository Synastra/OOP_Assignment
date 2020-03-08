
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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

    public void getHeader(String url){
        try
        {

            Document html = Jsoup.parse(Jsoup.connect(url).get().html());
            //Elements header = html.getElementsByTag("h3");
            Element link = html.select("h3").first();


            System.out.println("Outer HTML: " + link.outerHtml());
            System.out.println("Inner HTML: " + link.html());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


}
