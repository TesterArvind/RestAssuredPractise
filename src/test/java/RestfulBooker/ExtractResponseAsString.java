package RestfulBooker;

import io.restassured.RestAssured;

public class ExtractResponseAsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String response = RestAssured
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
		         .log().all().extract()
//		         .body()
		         .asPrettyString();
		 
		 System.out.print(response);
				

	}

}
