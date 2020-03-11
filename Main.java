package OOP.Assignment1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import javax.swing.plaf.synth.SynthEditorPaneUI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
    	String newurl = null;
    	String newurl2 = null;
        String url = "https://global.rakuten.com/en/search/?k=socks&l-id=search_regular"; // other than first time... url will be url = page.getNextUrl(url)
        String url2 = "";
        		// RakutenCrawl crawl = new RakutenCrawl();
        RakutenCrawl crawl = new RakutenCrawl();
        
     for(int i=1;i<=5;i++) {
    	 if(i == 1) {
    		// crawl.getWords(url);
    		 crawl.crawl(url);
    	 }
    	 /*if(i > 1){
        	//newurl = "https://global.rakuten.com/en/search/?k=socks&p="+i+"&l-id=search_regular";
    		 newurl2 ="https://www.qoo10.sg/s/?search_option=tt&gdlc_cd=&gdmc_cd=&gdsc_cd=&keyword_hist=socks&delivery_group_no=&bundle_policy=&bundle_delivery=&keyword=&sortType=RANK_POINT&dispType=LIST&flt_pri_idx=&filterDelivery=NNNNNANNNN&search_global_yn=&basis=&shipFromNation=&shipto=SG&brandnm=&SearchNationCode=&is_research_yn=Y&hid_keyword=socks&quick_delivery_yn=&qprime_yn=&shipping_avg_dt=&video_goods_yn=&coupon_filter_no=&gd_type=&drugs_type=&relation_group_no=&multiple_ship_from_yn=Y&priceMin=&priceMax=&category_specific_kw_nos=&curPage="+i+"&pageSize=60&partial=off&brandno=#anchor_detail_top";
        	//crawl.getWords(newurl);
    		 System.out.println(newurl2);
        	crawl2.getWords(newurl2);
     
       	}*/
     }
  /*  public void setData(String header,String price, String source) {
    FirebaseDatabase firebaseDatabase;
    String DATABASE_URL = "https://ooop-6969.firebaseio.com/";
 		FileInputStream serviceAccount = new FileInputStream("C:\\Users\\Aloysius\\Desktop\\ooop-6969-firebase-adminsdk-arx6j-fbc9ed80d0.json");


         try {
         	FirebaseOptions options = new FirebaseOptions.Builder()
         			  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
         			  .setDatabaseUrl("https://ooop-6969.firebaseio.com")
         			  .build();

         			FirebaseApp.initializeApp(options);
             firebaseDatabase = FirebaseDatabase.getInstance(DATABASE_URL);

         } catch (IOException ioe) {
             System.out.println(ioe.getMessage());
         }
     
     DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Socks").child("header");


     //DatabaseReference dataRef = ref.child("Socks");
     ref.setValueAsync("koko").get();

    }*/


    }
}

/*get the titles. get the next button line. replace it as url. repeat. */
