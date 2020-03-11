package OOP.Assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SetData {

	public SetData() throws Exception {
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
	}
	public void setData(String header,String price, String source) throws FileNotFoundException, InterruptedException, ExecutionException {
	     
	     String uid = FirebaseDatabase.getInstance().getReference("Socks").push().getKey();
	     System.out.println(uid);
	     DatabaseReference insertuid = FirebaseDatabase.getInstance().getReference().child("Socks").push();
	     insertuid.setValueAsync(uid).get();
	     DatabaseReference ref1 = insertuid.child("header");
	     DatabaseReference ref2 = insertuid.child("price");
	     DatabaseReference ref3 = insertuid.child("source");
	     //DatabaseReference dataRef = ref.child("Socks");

	     ref1.setValue(header, new DatabaseReference.CompletionListener() {
	         @Override
	         public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
	             if (databaseError != null) {
	                 System.out.println("Data could not be saved " + databaseError.getMessage());
	             } else {
	                 System.out.println("Data saved successfully.");
	             }
	         }
	     });
	     ref2.setValueAsync(price).get();
	     ref3.setValueAsync(source).get();

	    }

}
