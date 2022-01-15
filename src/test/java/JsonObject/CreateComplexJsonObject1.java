package JsonObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class CreateComplexJsonObject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Map<String,Object>> finalPayload = new ArrayList<Map<String,Object>>();
		Map<String,Object> firstJsonObject = new LinkedHashMap<String, Object>();
		firstJsonObject.put("id", 1);
		firstJsonObject.put("first_name", "Claire");
		firstJsonObject.put("last_name", "Dennerley");
		firstJsonObject.put("email", "cdennerley0@uol.com.br");
		firstJsonObject.put("gender", "Male");
		
		List<String> mobileNumber = Arrays.asList("123", "456");
		firstJsonObject.put("Mobile", mobileNumber);
		
		Map<String,String> secJsonObject = new LinkedHashMap<String, String>();
		secJsonObject.put("name", "Testing");
		secJsonObject.put("proficiency", "medium");
		
		firstJsonObject.put("skill", secJsonObject);
		
//		
//		 Gson gson = new Gson();
//		 // convert your list to json
//		 String jsonCartList = gson.toJson(firstJsonObject);
//		 // print your generated json
//		 System.out.println("jsonCartList: " + jsonCartList);
		 
			Map<String,Object> secondJsonObject = new LinkedHashMap<String, Object>();
			secondJsonObject.put("id", 2);
			secondJsonObject.put("first_name", "arvind");
			secondJsonObject.put("email", "Arvind.com.br");
			secondJsonObject.put("gender", "Male");
			
			List<Object> list1 = new ArrayList<Object>();
			
			Map<String,String> map1= new LinkedHashMap<String,String>();
			map1.put("test", "java");
			map1.put("prof", "expert");
			
			Map<String,Object> map2= new LinkedHashMap<String,Object>();
			map2.put("name", "java");
			map2.put("proficiency", "medium");
			
			Map<String,String> map3= new LinkedHashMap<String,String>();
			map3.put("0", "ocjp11");
			map3.put("1", "ocjp12");
			
			
			List<Object> listCert = new ArrayList<Object>();
			listCert.add(map3);
		
			map2.put("certification", listCert);
			
			
			
			list1.add(map1);
			list1.add(map2);
			secondJsonObject.put("skills", list1);
			
			
			 Gson gson = new Gson();
			 // convert your list to json
			 String jsonCartList = gson.toJson(secondJsonObject);
			 // print your generated json
			 System.out.println("jsonCartList: " + jsonCartList);
			
			
			
			
			


	}

}
