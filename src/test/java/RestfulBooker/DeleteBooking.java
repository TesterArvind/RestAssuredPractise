package RestfulBooker;

import io.restassured.RestAssured;

public class DeleteBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
	 	   .given()
	 	         .log().all()
	 	         .baseUri("http://restful-booker.herokuapp.com/")
	 	         .basePath("booking/30")
	 	         .header("Content-Type","application/json")
	 	         .header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
	 	         .contentType("application/json")
	 	   .when() 
	 	         .delete()
	 	   .then()
	 	         .log().all().statusCode(201);
		

	}

}
