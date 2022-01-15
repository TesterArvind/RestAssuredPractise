package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {

	public static void main(String[] args) {
	
        
		
		
		// BDD format below
        
       String response = RestAssured
   .given()
         
         .baseUri("http://restful-booker.herokuapp.com/")
         .basePath("booking")
         .body("{\n"
				+ "    \"firstname\" : \"vic\",\n"
				+ "    \"lastname\" : \"Brown\",\n"
				+ "    \"totalprice\" : 111,\n"
				+ "    \"depositpaid\" : true,\n"
				+ "    \"bookingdates\" : {\n"
				+ "        \"checkin\" : \"2018-01-01\",\n"
				+ "        \"checkout\" : \"2019-01-01\"\n"
				+ "    },\n"
				+ "    \"additionalneeds\" : \"Breakfast\"\n"
				+ "}")
         .contentType("application/json")
   .when() 
         .post()
   .then()
         
         .extract()
         .body()
         .asPrettyString();
       
       JsonPath path = new JsonPath(response);
		
		
		System.out.println(path.get("booking.firstname"));
		System.out.println(path.get("booking.bookingdates.checkin"));
		System.out.println(path.get("booking.additionalneeds"));

		
		System.out.println(response);
		

	}

}
