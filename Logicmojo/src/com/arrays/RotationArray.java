package com.arrays;


public class RotationArray {
	public static void main(String[] args) {
		int arr[]= {2, 4 ,6 ,8, 10, 12 ,14 ,16 ,18, 20};
        //o/p-8 10 12 14 16 18 20 2 4 6


        //{3,4,5,1,2};
		int k=2;
		int result[]=getSortedArray(arr,arr.length,k);
		for (int s = 0; s < result.length; s++) {
			System.out.print(result[s]+",");
		}
	}

	private static int[] getSortedArray(int[] arr, int n,int k) {
		for( int i=0;i<n-1;i++)
		{
			if(i<k)
			{
				swap(arr,0,i);
				swap(arr,i+1,n-1);
				swap(arr,0,n-1);
				
			}
		}
		
		
		
		return arr;
	}

	private static void swap(int[] arr, int i, int i2) {
		
         int temp;
         while(i<i2) {
         temp=arr[i];	 
         arr[i]=arr[i2];
         arr[i2]=temp;
         i++;
         i2--;
         }
	}

}
