package JAVA;

public class FindDifferenceBetweenTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="abcd";
		String t ="abdcj";
		
		int i=0;
		int j=s.length()-1;
		int sum=0;
		
		while(i <= j) {
			
			sum+=t.charAt(i)-s.charAt(i);
			i++;
		}
		

		sum = sum + t.charAt(i);
		
		System.out.println((char)sum);

	}

}
