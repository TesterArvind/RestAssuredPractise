package Payload;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class Payload1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Object> payload = new HashMap<String, Object>();
		payload.put("id", 1);
		payload.put("name", "Arvind");
		payload.put("class", "10");
		
		System.out.println(payload);
	}

}
