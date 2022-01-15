package JAVA;

import java.util.Arrays;

public class String4 {
	
	public static int[] searchRange(int[] nums, int target) {
		
		System.out.println(Arrays.toString(nums));
		
		int[] a = {-1,-1};
		if(nums == null) {
			return a;
		}
	    
        int[] res = new int[2];
        
        
        int i=0;
        int j = nums.length-1;
        int fc=0;
        int lc =1;
        int count=0;
        System.out.println(Arrays.toString(res));
      
        
        while(i<=j){
            
            if(nums[i] == target){
            	res[fc++]=i;	
                i++;
                count++;
            }else{
                i++;
            }
            
             if(nums[j] == target){
                
            	 res[lc--]=j;
                j--;
                count++;
            }else{
                j--;
          }
	
	  }
        
        if (count == 0) {
      
        	return a;
        }
        
     
      
        return res;
    }
	

	public static void main(String[] args) {
		int target =4;
		int [] num = {1,4};
		System.out.println(Arrays.toString(searchRange(num, target)));
		

	}

}
