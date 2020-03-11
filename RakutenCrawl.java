package OOP.Assignment1;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class RakutenCrawl extends MainCrawl{
	
	public RakutenCrawl() {
		// TODO Auto-generated constructor stub
	}
	@Override
    public void crawl(String url)
    {
        try
        {	
        	int counter = 0;
        	
        	SetData setdata = new SetData();
            Document doc = Jsoup.connect(url).get();
            //System.out.println(doc.outerHtml());
            //Elements row = doc.getElementsByClass("b-content b-fix-2lines");
            Elements row = doc.getElementsByClass("b-content b-fix-2lines").select("a");
            Elements row2 = doc.getElementsByClass("b-content m-shop-top-text").select("span");
            for (Element rows : row)
            {
            	
                System.out.println(rows.text());
                String header = rows.text();
                String price = row2.get(counter).ownText();
                String source = "Rakuten";
                System.out.println("this is the price" + price);
                counter += 2;
                setdata.setData(header,price,source);
                
                

                
             
            }
            
        }
        	
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    

}
