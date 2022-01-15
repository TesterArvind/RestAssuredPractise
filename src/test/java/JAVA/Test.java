package JAVA;

import java.util.Arrays;

public class Test {
	
	 public static boolean isPalindrome(String s) {
	        
	       
			String newString = "";
			for(int i=0; i<s.length(); i++) {
				
				if(Character.isLetterOrDigit(s.charAt(i))){
					newString +=s.charAt(i);
					
			}

		}
			
			int i=0;
			
	        String k=newString.toLowerCase();
	        System.out.println(k);
	        int j= k.length()-1;
			while(i<j) {
				if(k.charAt(i) != k.charAt(j)) {
	           
					return false;	
				}
	            i++;
	            j--;
			}
	        
	        return true;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "0P";
		
		System.out.println(isPalindrome(s));
		
		
  }
}


