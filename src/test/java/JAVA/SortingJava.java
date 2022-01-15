package JAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "is2 sentence4 This1 a3";
		
		
		
	    String[] word = s.split(" ");
	      
	    String op = "";
	              
	     Map<Integer,String> map = new TreeMap<Integer,String>();
	    	        
	     for(int i=0; i<=word.length-1; i++) {
	    	 
	    	 int index = Character.getNumericValue((word[i].charAt(word[i].length()-1))-1);
	    	 

	    	 String value = word[i].substring(0, word[i].length()-1);
	    	  map.put(index, value)	;
	    	        }
	    
	     for(Map.Entry<Integer, String> entry : map.entrySet()) {
	    	
//	    	 System.out.println(entry.getValue());
	    	 op =op + entry.getValue() + " ";
	     }
	     
	     System.out.print(op);
	     
	     
		

	}

}
