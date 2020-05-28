package com.arrays;

public class Sort012 {
	
public static void main(String[] args) {

	int arr[]= {2,1,0,1,2,0};
	  sortwithoutspace(arr,arr.length);
}

private static void sortwithoutspace(int[] arr, int n) {
	int low=0,mid=0;
	int high=n-1;
	
	while(mid<=high)
	{
	if(arr[mid] == 2)	{
	swap(arr,mid,high);
	 
	 high--;
	}
	else if(arr[mid] == 0)
	{ 
		swap(arr, low, mid);
		low++;
		mid++;
	}else
	{
		mid++;
	}
	
	
}
	for (int i : arr) {
		System.out.print(i+" ,");
	}
	
	
}

private static void swap(int[] arr, int mid,int low) {
	  int temp =arr[mid];
	   arr[mid]=arr[low];
	   arr[low]=temp;
}
}