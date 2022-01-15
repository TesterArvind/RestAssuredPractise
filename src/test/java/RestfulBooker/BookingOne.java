package RestfulBooker;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BookingOne {
	
	
	@Test
	public void createBooking(){
		
		RestAssured
		   .given()
		         .log().all()
		         .baseUri("http://restful-booker.herokuapp.com/")
		         .basePath("booking")
		         .body("{\n"
						+ "    \"firstname\" : \"Jim\",\n"
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
		         .log().all().statusCode(200);
				
	}

}
