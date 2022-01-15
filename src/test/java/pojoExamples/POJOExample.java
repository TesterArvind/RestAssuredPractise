package pojoExamples;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class POJOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeNestedJson e1= new EmployeNestedJson();
        e1.setDepartment(123);
        e1.setGender("male");
        e1.setId(1);
        e1.setName("Arvind");
        e1.setPhoneNumber("9808980");
       
        
        Address a1 = new Address();
        a1.setCityName("areraj");
        a1.setGullyNo("5");
        a1.setMohalla("new");
        
        System.out.println(a1.getMohalla());
        
        Address a2 = new Address();
        a2.setCityName("areraj1131");
        a2.setGullyNo("523");
        a2.setMohalla("new1313");
        System.out.println(a2.getMohalla());
        
        
        List<Address> la= new ArrayList<Address>();
        
        la.add(a1);
        la.add(a2);
        
        e1.setAddress(la);
        
        RestAssured.given().log().all().body(e1).when().get();
        
        
	}

}
