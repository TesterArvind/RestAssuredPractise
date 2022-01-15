package RestfulBooker;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class TokenMatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    RestAssured
	    		   .given()
	    		         
	    		         .baseUri("https://restful-booker.herokuapp.com")
	    		         .basePath("auth")
	    		         .body("{\n"
	    		         		+ "    \"username\" : \"admin\",\n"
	    		         		+ "    \"password\" : \"password123\"\n"
	    		         		+ "}")
	    		         .contentType("application/json")
	    		   .when() 
	    		         .post()
	    		   .then()
	    		         
	    		         .log().all()
	    		     	.body("token",Matchers.notNullValue())
	    				.body("token.length()", Matchers.is(15))
	    				.body("token.length()", Matchers.equalTo(15))
	    				.body("token", Matchers.matchesRegex("^[a-z0-9]+$"));
	}

}
