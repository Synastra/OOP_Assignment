
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        /*String url = "https://www.channelnewsasia.com/news/topic/stock-market"; // other than first time... url will be url = page.getNextUrl(url)
        Crawl crawl = new Crawl();
        crawl.getWords(url);
        crawl.getHeader(url);

        Page page = new Page();
        System.out.println(page.getNextUrl(url));*/
        Web test = new Web();
        test.test();


    }
}


class Web {
    public void test() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://sg.carousell.com/search/socks?");
        Thread.sleep(500);
        for (int i = 0; i<2; i++)
        {
            driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/main/div/button")).click();
            Thread.sleep(500);
        }
        List<WebElement> all = driver.findElements(By.className("TpQXuJG_eo"));
        WebElement name = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/div/div[1]/div[1]/a[2]/p[1]"));
        String nawa = name.getText();
        int i = 1;
        for(WebElement each : all){
            try{
                System.out.println(each.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/div/div["+i+"]/div[1]/a[2]/p[1]")).getText());
                System.out.println(each.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/div[2]/main/div/div/div["+i+"]/div[1]/a[2]/p[2]")).getText());
                i++;
            }
            catch (Exception e)
            {
                i++;
            }

        }

        //System.out.println(nawa);

        Thread.sleep(10000);
        driver.quit();

    }
}




