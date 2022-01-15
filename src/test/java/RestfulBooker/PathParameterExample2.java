package RestfulBooker;

import io.restassured.RestAssured;

// tutorial 11 to 15 not done 

public class PathParameterExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RestAssured
		.given()
		       .log().all()
//		       .baseUri("https://restful-booker.herokuapp.com/")
//		       .basePath("{basePath}/{bookingId}")
//		       .pathParam("basePath", "booking")
//		       .pathParam("bookingId", 2)
		.when()
		       .get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}","booking", 3)
		       
		.then()
		        .log().all()
				.statusCode(200);

	}

}
