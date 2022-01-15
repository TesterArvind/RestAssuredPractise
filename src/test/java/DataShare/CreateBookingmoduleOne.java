package DataShare;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBookingmoduleOne {

	@Test(priority =1)
	public static void createBooking() {
	      
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
	DataStoreAsMap.setValue(TestConstant.BOOKING_ID, path.get("bookingid"));
	
	}
    
	@Test(priority =2)
	private static void getBooking() {
		// TODO Auto-generated method stub
		Response response1 = RestAssured
		        .given()
		        .log()
		        .all()
				.get("https://restful-booker.herokuapp.com/booking/"+ DataStoreAsMap.getValue(TestConstant.BOOKING_ID))
				.then().log().all().extract().response();
		
	}

	}


