package com.arrays;

public class LeaderArray {
	public static void main(String[] args) {
		//int arr[]= {6,17,4,3,5,2};
		int arr[]= {80,100,110,3,5,2};

		findLeader(arr,arr.length);
	}

	private static void findLeader(int[]arr, int n) {
         int result[]= new int[n];
         int min_val =arr[n-1];
         System.out.print(min_val);
         
		 for(int i=n-1;i>0;i--)
		 {
			 if(arr[i-1]>arr[i] && arr[i-1]> min_val)
			 {
				 System.out.print(","+arr[i-1]);
				 min_val=arr[i-1];
			 }
			 
		 }
         
	}

}
