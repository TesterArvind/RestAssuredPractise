package JAVA;

public class StringProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s="helo";    
		 
		 int num = s.length()/2;
		 System.out.println("Original String: " + s);  
		 System.out.println("Substring starting from index 6: " +s.substring(num));//Tendulkar    
		 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,num)); //Sachin  
		 
		 if(numberOfVowels(s.substring(num)) == numberOfVowels(s.substring(0,num))) {
			 System.out.println("true");
			 
		 }
		 
		
	}
	
	private static int numberOfVowels(String s) {
		int count=0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u' || s.charAt(i) =='A' || s.charAt(i) =='E' || s.charAt(i) =='I' || s.charAt(i) =='O' || s.charAt(i) =='U') {
				
				count++;
				
				
				
			}
		}
		
		
		return count;
	}

}
