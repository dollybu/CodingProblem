package com.arrays;

public class MaxSlidingWindow {

	public static void main(String[] args) {
		//int arr[]= {1,2,3,1,4,5,1,6};
		//3,3,4,5,5,6
		int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
				//Output: 10 10 10 15 15 90 90
		int k=4;
		printMaxSlidWind(arr,k);
		
	}

	private static void printMaxSlidWind(int[] arr, int k) {
		int len=arr.length;
		int count=0;
		int maxwindow=Integer.MIN_VALUE;

			for(int i=0;i<len;i++)
			{
                  count++; 
	             if(maxwindow<arr[i])
				    maxwindow=arr[i];
	             if(count == k)
	             {
	 			  System.out.print(maxwindow+" ");
	 			  count=k-1;
	 			  }
	                
					
				}
				
			}
	
}
