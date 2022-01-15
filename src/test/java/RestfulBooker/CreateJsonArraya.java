package RestfulBooker;

import io.restassured.path.json.JsonPath;

public class CreateJsonArraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jsonArray = "[\n"
				+ "  [\"10\",\"12\",\"1212\"], \n"
				+ "  [\"12\",\"123\",\"122\"]\n"
				+ "]";
		
		JsonPath p = new JsonPath(jsonArray);
		System.out.println(p.get("[1][2]"));

	}

}
