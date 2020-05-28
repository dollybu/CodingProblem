package com.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.stream.IntStream;

public class KthSmallElement {

	public static void main(String[] args) {
		int arr[]= {7,10,4,3,20,5};
		int kth=3;
		//int val=getKthElemt(arr,kth);
		//System.out.println(val);
		getKthElementHash(arr,kth);
		
	}

	//Using Sort O(nlogn)
	private static int getKthElemt(int[] arr, int kth) {
		
		Arrays.sort(arr);
		int result=arr[kth];
		
		
		return result;
				
	}
	
	//using Hashtable
	
	
	private static void  getKthElementHash(int[] arr, int kth) {
		
		HashSet<Integer> hashset=new HashSet<Integer>(); 
		for(int i=0;i<arr.length;i++)
		{
			hashset.add(arr[i]);
		}
	
		
       System.out.println(hashset.stream().limit(kth).toString());

        /*for(int i=0;i<hashset.size();i++)
		{
        	System.out.println(hashset.stream().limit(kth));
			
		}*/
		
		//int result=arr[kth];
		
		
		//return result;
				
	}

	
	
}
