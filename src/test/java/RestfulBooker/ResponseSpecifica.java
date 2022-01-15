package RestfulBooker;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.*;
//import io.restassured.specification.ResponseSpecification;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

    public class ResponseSpecifica {
	
	
	
	ResponseSpecification respSpec;
	
	
	
	
	@BeforeClass
	public void setExpectation() {
		
	    respSpec = RestAssured.expect();
		respSpec.statusCode(200);
		respSpec.contentType(ContentType.JSON);
		respSpec.statusCode(200);
		respSpec.time(Matchers.lessThan(5000l));
	}
	
	@Test
	public void createBooking() {
		
		
		
		
		     RestAssured
  	   .given()
  	         .log().all()
  	         .baseUri("http://restful-booker.herokuapp.com/")
  	         .basePath("booking")
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
  	         .post()
  	   .then()
  	         .log().all()
  	         .spec(respSpec);
		
		
		
	}

}
