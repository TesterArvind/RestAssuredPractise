package pojo2;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class PojoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employeee e1 = new Employeee();
		e1.setAge(25);
		e1.setFirstName("Jon");
		e1.setLastName("Doe");
		System.out.println(e1.getLastName());
		
		Employeee e2= new Employeee();
		e2.setAge(25);
		e2.setFirstName("Marry");
		e2.setLastName("Smith");
		
		System.out.println(e2.getLastName());
		
		Employeee e3= new Employeee();
		e3.setAge(24);
		e3.setFirstName("Sally");
		e3.setLastName("Green");
		
		System.out.println(e3.getLastName());
		
		Employeee e4= new Employeee();
		e4.setAge(23);
		e4.setFirstName("Jim");
		e4.setLastName("Gallery");
		System.out.println(e4.getLastName());
		
		List<Employeee> l1= new ArrayList<Employeee>();
		l1.add(e1);
		l1.add(e2);
		
		
		List<Employeee> l2= new ArrayList<Employeee>();
		l2.add(e3);
		l2.add(e4);
		
		
		PojoObject obj = new PojoObject();
		obj.setAccounting(l1);
		obj.setSales(l2);
		
//		syso
		RestAssured.given().log().all().body(obj).when().get();
//		System.out.println(obj.toString());

	}

}
