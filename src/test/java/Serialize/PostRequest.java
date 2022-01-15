package Serialize;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class PostRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddPlace p = new AddPlace();
		p.setAccuracy("kl");
		p.setAddress("arrerj");
		p.setLanguage("english");
		p.setName("Arvind");
		p.setPhoneNumber("6360151689");
		p.setWebsite("google.com");
		
		Location l= new Location();
		l.setLat("10");
		l.setLng("11");
		p.setLocation(l);
		
		List<String> l1= new ArrayList<String>();
		l1.add("ab");
		l1.add("cd");
		p.setType(l1);
		
		  RestAssured.given().log().all().body(p).when().get();
	        
		
		

	}

}
