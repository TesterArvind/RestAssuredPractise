package RestfulBooker;

import io.restassured.RestAssured;

public class UpdateBookingPatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
 	   .given()
 	         .log().all()
 	         .baseUri("http://restful-booker.herokuapp.com/")
 	         .basePath("booking/1")
 	         .header("Content-Type","application/json")
 	         .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
 	         .body("{\n"
 	         		+ "    \"firstname\" : \"James\",\n"
 	         		+ "    \"lastname\" : \"Brown\"\n"
 	         		+ "}")
 	         .contentType("application/json")
 	   .when() 
 	         .patch()
 	   .then()
 	         .log().all().statusCode(200);
	

	}

}
