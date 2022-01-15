package pojoExamples;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class POJOExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		e1.setId(1);
		e1.setAddress("areraj");
		e1.setDepartment(12);
		e1.setGender("Male");
		e1.setName("Arvind");
		e1.setPhoneNumber("6360151689");
		
		Employee e2= new Employee();
		e2.setId(1);
		e2.setAddress("areraj");
		e2.setDepartment(12);
		e2.setGender("Male");
		e2.setName("Arvind");
		e2.setPhoneNumber("6360151689");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e2);
		list.add(e1);
		
		RestAssured.given().log().all().body(list).when().get();
		
		

	}

}
