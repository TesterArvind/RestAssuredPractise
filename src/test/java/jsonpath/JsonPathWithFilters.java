package jsonpath;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String filePath= System.getProperty("user.dir")+"/src/test/resources/resource/people.json";
		
		File jsonArray = new File(filePath);
		JsonPath json = new JsonPath(jsonArray);
		
		System.out.println(json.getString("[0].first_name"));
		
		List<String> firstNames = json.getList("first_name");
		System.out.println(firstNames);
		
		List<String> maleNames = json.getList("findAll{it.gender == 'Male'}.first_name");
		System.out.println(maleNames);

	}

}
