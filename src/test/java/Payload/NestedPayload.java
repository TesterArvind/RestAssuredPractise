package Payload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;



public class NestedPayload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Object> payLoad = new HashMap<String,Object>();
		
		payLoad.put("id", 1);
		payLoad.put("f_name", "Arvind");
		payLoad.put("l_name", "singh");
		payLoad.put("married", true);
		payLoad.put("Salary", 18.78);
		Map<String, String> add = new HashMap<String,String>();
		add.put("no.", "1");
		add.put("name", "Radha Sadan");
		add.put("city", "areraj");
		add.put("state", "bihar");
		payLoad.put("address", add);
		
       Map<String, Object> payLoad1 = new HashMap<String,Object>();
		
		payLoad1.put("id", 2);
		payLoad1.put("f_name", "Arvind");
		payLoad1.put("l_name", "singh");
		payLoad1.put("married", true);
		payLoad1.put("Salary", 18.78);
		Map<String, String> add1 = new HashMap<String,String>();
		add1.put("no.", "2");
		add1.put("name", "Radha Sadan");
		add1.put("city", "areraj");
		add1.put("state", "bihar");
		payLoad1.put("address1", add1);
		
//		System.out.println(payLoad);
		
		
		List<Map<String,Object>> allEmp = new ArrayList<Map<String, Object>>();
		
		allEmp.add(payLoad);
		allEmp.add(payLoad1);
		
		JSONObject  obj = new JSONObject(payLoad);
		JSONArray ar = new JSONArray(allEmp);
		System.out.println(ar);
		
		

	}

}
