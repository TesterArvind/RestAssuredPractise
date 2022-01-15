package pojo4;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class pojotest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author = new Author();
		author.setFirstname("Doe");
		author.setLastname("Jane");
		
		
		Editor editor = new Editor();
		editor.setFirstname("Smith");
		editor.setLastname("Jane");
		
		List<String> list = new ArrayList<String>();
		list.add("Non-Fiction");
		list.add("Technology");
		
		MainObject obj = new MainObject();
		obj.setIsbn("123-456-222");
		obj.setAuthor(author);
		obj.setCategory(list);
		obj.setEditor(editor);
		obj.setTitle("The Ultimate Database Study Guide");
		
		RestAssured.given().log().all().body(obj).when().get();
		

	}

}
