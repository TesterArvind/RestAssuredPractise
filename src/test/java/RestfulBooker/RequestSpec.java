package RestfulBooker;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {
	
	RequestSpecification reqSpec;
	
	@BeforeClass
	public void setRequest() {
		
		reqSpec = RestAssured.given();
		reqSpec.log().all()
        .baseUri("http://restful-booker.herokuapp.com/")
        .basePath("booking/1")
        .header("Content-Type","application/json")
        .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
        .contentType("application/json");
		
		
	}

	
		
		@Test
		public void createBooking() {
			
			RestAssured
	    	   .given()
	    	         .spec(reqSpec)
	    	         .basePath("booking")
	    	         .body("{\n"
	    					+ "    \"firstname\" : \"arvind\",\n"
	    					+ "    \"lastname\" : \"kumnmnm\",\n"
	    					+ "    \"totalprice\" : 111,\n"
	    					+ "    \"depositpaid\" : true,\n"
	    					+ "    \"bookingdates\" : {\n"
	    					+ "        \"checkin\" : \"2018-01-01\",\n"
	    					+ "        \"checkout\" : \"2019-01-01\"\n"
	    					+ "    },\n"
	    					+ "    \"additionalneeds\" : \"Breakfast\"\n"
	    					+ "}")
	    	       
	    	   .when() 
	    	         .post()
	    	   .then()
	    	         .log().all().statusCode(200);
			
		}
		
		@Test
		public void updateBooking() {
			
			RestAssured
	    	   .given()
	    	         .spec(reqSpec)
	    	         .basePath("booking/1")
	    	         .body("{\n"
	    					+ "    \"firstname\" : \"arvind\",\n"
	    					+ "    \"lastname\" : \"kumnmnm\",\n"
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
	    	         .put()
	    	   .then()
	    	         .log().all().statusCode(200);
			
		}

	

	

}
