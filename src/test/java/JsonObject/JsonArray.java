package JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import io.restassured.RestAssured;

public class JsonArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Object> emp1= new HashMap<String,Object>();
	    emp1.put("name", "vick");
		emp1.put("age", "12");
		emp1.put("sex", "Male");
		emp1.put("Married", true);
		
		Map<String,Object> emp2= new HashMap<String,Object>();
		  emp2.put("name", "vick");
			emp2.put("age", "12");
			emp2.put("sex", "Male");
			emp2.put("Married", true);
			
			List<Map<String,Object>> arrayList = new ArrayList<Map<String,Object>>();
			arrayList.add(emp2);
			arrayList.add(emp1);
			
			
			 Gson gson = new Gson();
			 
			 
			 String jsonCartList = gson.toJson(arrayList);
			 // print your generated json
			 System.out.println("jsonCartList: " + jsonCartList);
			
			RestAssured.given().log().all().body(arrayList).get();
			
			System.out.println(arrayList);

	}

}
