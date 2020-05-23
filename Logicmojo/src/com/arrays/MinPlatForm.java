package com.arrays;

import java.util.Arrays;

public class MinPlatForm {

	public static void main(String[] args) {
		double aTime[]= {1.00,2.40,1.50,2.0,2.15,4.0};
		double deTime[]= {1.10,3.0,2.20,3.15,6.0};
		System.out.println(getPlatform(aTime,deTime));
	}

	private static int getPlatform(double[] aTime, double[] deTime) {
      int platform =1;
      Arrays.sort(aTime);
      Arrays.sort(deTime);
      for(double d1:deTime)
    	  System.out.print(d1+",");
      System.out.println(" ");
      int n=aTime.length;
      int j=0,i=0;
      int maxplatform=1;
      while(i<n && j<n)
      {
    	  
    	if(aTime[i]<=deTime[j])
    	{
    		platform++;
    		i++;
    		if(platform >maxplatform)
    			maxplatform=platform;
    		
    	}
    	else
    	{
    		
    	 platform--;
    	 j++;
    	}
    	  
      }

		return maxplatform;
	}
}
