package pojo3;

import io.restassured.RestAssured;

public class pojotest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Image image = new Image();
		image.setHeight("image");
		image.setUrl("200");
		image.setWidth("200");
		
		Thumbnail tn = new Thumbnail();
		tn.setHeight("image/2022");
		tn.setUrl("30");
		tn.setWidth("300");
		
		MainObject obj = new MainObject();
		obj.setId("12");
		obj.setImage(image);
		obj.setName("arvind");
		obj.setThumbnail(tn);
		obj.setType("type");
		
		
		RestAssured.given().log().all().body(obj).when().get();
//		System.out.println(obj.toString());
		

	}

}
