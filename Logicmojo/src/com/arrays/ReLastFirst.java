package com.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReLastFirst {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int result[]= updateFirstLast(arr,arr.length);
	    IntStream.of(result).forEach(System.out::print);
	}

	private static int[] updateFirstLast(int[] arr, int n) {
     int temp=arr[n-1];
     
    	
      for(int i=n-1;i>0;i--)
      {
    	   int temp1=arr[i-1];
    	   arr[i-1]= arr[i];
    	   arr[i]=temp1;
    	  
      }
    
      arr[0] = temp;

        
		return arr;
	}
}
