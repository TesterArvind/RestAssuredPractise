package RahulShetty;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		RestAssured.baseURI="https://rahulshettyacademy.com";
//		
//		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//		.body("{\n"
//				+ "  \"location\": {\n"
//				+ "    \"lat\": -38.383494,\n"
//				+ "    \"lng\": 33.427362\n"
//				+ "  },\n"
//				+ "  \"accuracy\": 50,\n"
//				+ "  \"name\": \"Frontline house\",\n"
//				+ "  \"phone_number\": \"(+91) 983 893 3937\",\n"
//				+ "  \"address\": \"29, side layout, cohen 09\",\n"
//				+ "  \"types\": [\n"
//				+ "    \"shoe park\",\n"
//				+ "    \"shop\"\n"
//				+ "  ],\n"
//				+ "  \"website\": \"http://google.com\",\n"
//				+ "  \"language\": \"French-IN\"\n"
//				+ "}\n"
//				+ "")
//		.when()
//		.post("/maps/api/place/add/json").then().log().all().statusCode(200).extract().asPrettyString();
//		
		JsonPath js = new JsonPath(Payload.CoursePrice());
		
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		int arraySize = js.getInt("courses.size()");
		int sum=0;
		
		for(int i=0; i<arraySize; i++) {
			int price = js.getInt("courses["+i+"].price");
			int copies = js.getInt("courses["+i+"].copies");
			int amount = price*copies;
			sum+=amount;
			
		}
		System.out.println(sum);
		System.out.println(purchaseAmount);
		
//		RestAssured.given().log().all().body(Payload.CoursePrice()).get();
		
		
	
	}

}
