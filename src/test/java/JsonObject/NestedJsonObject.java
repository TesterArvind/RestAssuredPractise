package JsonObject;

import java.util.HashMap;
import java.util.Map;

public class NestedJsonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Object> map = new HashMap<String,Object>();
		map.put("name", "vicky");
		map.put("age", 33);
		map.put("sex", "male");
		map.put("married", true);
		
		Map<String , Object> address = new HashMap<String,Object>();
		address.put("home", "radha sadan");
		address.put("fully", "5");
		address.put("shiv", "shankar");
		address.put("jjki", "tests");
		map.put("address", address);
		System.out.println(map);
		
		

	}

}
