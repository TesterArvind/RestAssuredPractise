package JAVA;

import java.util.Arrays;

public class String3 {

	public static void main(String[] args) {
		
		int[] nums = {5,7,7,8,8,10};
        int[] res = new int[2];
        
        int i=0;
        int j = nums.length-1;
        int fc=0;
        int lc =1;
        while (i<=j){
            
            if(nums[i] == 8){
                
            	res[fc++]=i;
            	
            	
                
                i++;
            }else{
                i++;
            }
            
             if(nums[j] == 8){
                
            	 res[lc--]=j;
                j--;
            }else{
                j--;
            }
  
		// TODO Auto-generated method stub

	}
System.out.println(Arrays.toString(res));

}}
