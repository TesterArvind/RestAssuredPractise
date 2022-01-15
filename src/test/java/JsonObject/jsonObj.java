package JsonObject;

import java.util.HashMap;
import java.util.Map;

public class jsonObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , Object> map = new HashMap<String,Object>();
		map.put("name", "vicky");
		map.put("age", 33);
		map.put("sex", "male");
		map.put("married", true);
		
		System.out.println(map);

	}

}
