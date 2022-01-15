package RestfulBooker;

import io.restassured.RestAssured;

public class UpdateBookingPut {
	
     public static void main(String[] args) {
    	 
    	  RestAssured
    	   .given()
    	         .log().all()
    	         .baseUri("http://restful-booker.herokuapp.com/")
    	         .basePath("booking/1")
    	         .header("Content-Type","application/json")
    	         .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
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
