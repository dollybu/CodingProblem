package com.arrays;

public class MissingElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,9};
		//int result=getElement(arr,arr.length);
		int result=getElementXor(arr,arr.length);

		System.out.println(result); 
	}

	private static int getElementXor(int[] arr, int len) {
		int a=arr[0],b=1;
		
		for(int i=1;i<len;i++)
		{
			a=a^arr[i];
			
		}
		for(int i=2;i<=len+1;i++)
		{
			b=b^i;
			
		}

		
		
		return a^b;
	}

	private static int getElement(int[] arr,int n) {
		int sum = (n+2)*(n+1)/2;
		System.out.println(sum);
		for(int i=0;i<arr.length;i++)
		{
		sum= sum-arr[i];	
		}
	
		return sum;
	}
}
