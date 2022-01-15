package cm.Testing;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop s= new Shop();
		s.setId(78);
		s.setName("Meesho_INDIA");
		
		
		
		Customer c = new Customer();
		
		c.setCustomer_name("Test_Customer");
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(599515);
		c.setCustomer_ids(l);
		
		List<Customer> c1 = new ArrayList<Customer>();
		c1.add(c);
		
		
		
		Object1 obj = new Object1();
		obj.setInclude(false);
		obj.setCustomer(c1);
		obj.setShop(s);
		
		RestAssured.given().log().all().body(obj).log().all();
		System.out.println("test");
		

		  
		  Map<String, String > headers = new HashMap<String,String>();
		  headers.put("cache-control", "no-cache");
		  headers.put("content-type", "application/json");
		  headers.put("country-code", "IN");
		  headers.put("id", "id");
		  headers.put("postman-token", "0fee6eb0-7700-bdf4-4471-113fc4408698");
		  headers.put("secret", "secret");
		  
		  ResponseBody response = 
				  RestAssured.given().log().all().
				           
				          
				          headers(headers).
				          body(obj).
				  when().
				          post("http://meesho.com/customer/1.0/download-data").
				  thenReturn().body();
		  
		  System.out.println(response.asPrettyString());
		  
		   String resp = "{\n"
		   		+ "    \"include\": false,\n"
		   		+ "    \"shop\": {\n"
		   		+ "        \"id\": 78,\n"
		   		+ "        \"name\": \"Meesho_INDIA\"\n"
		   		+ "    },\n"
		   		+ "    \"customer\": [\n"
		   		+ "        {\n"
		   		+ "            \"customer_name\": \"Test_Customer\",\n"
		   		+ "            \"customer_ids\": [\n"
		   		+ "                599515\n"
		   		+ "            ]\n"
		   		+ "        }\n"
		   		+ "    ]\n"
		   		+ "}";
		   
		   
		   
		  JsonPath js = new JsonPath(resp);
		  String customerId = js.getString("customer[0].customer_ids[0]");
		  
		  Map<String,Object> map2= new HashMap<String,Object>();
		  map2.put("customerId", customerId);
		  map2.put("recordSent", true);
		  
		
	}

}
