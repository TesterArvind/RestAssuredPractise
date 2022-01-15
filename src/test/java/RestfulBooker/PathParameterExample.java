package RestfulBooker;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParameterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Object> pathParamters = new HashMap<String, Object>();
		
		pathParamters.put("basePath", "booking");
		pathParamters.put("bookingId", 1);
		
		
		
		
		RestAssured
		.given()
		       .log().all()
		       .baseUri("https://restful-booker.herokuapp.com/")
		       .basePath("{basePath}/{bookingId}")
		       .pathParams(pathParamters)
		.when()
		       .get()
		       
		.then()
		        .log().all()
				.statusCode(200);

	}

}
