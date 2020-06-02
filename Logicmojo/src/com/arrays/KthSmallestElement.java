package com.arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		int arr[]= {54,26,93,17,77,31,44,20,55};
		int k=2;
		findKthSmallEle(arr,0,arr.length-1,k-1);
	}

	private static void findKthSmallEle(int[] arr, int start,int end,int k) {
		int j=start,i=start;
		int pivot= end;
		if(start == pivot)
			return ;
		
	    while(i<pivot)
	    {
	    	
	    	if(arr[i]<arr[pivot])
	    	{
	    		int temp=arr[i];
	    		   arr[i]=arr[j];
	    		   arr[j]=temp;
	    		   j++;
	    	 
	    		
	    	}
	    	i++;
	    	
	    	
	    }
		int temp=arr[pivot];
		   arr[pivot]=arr[j];
		   arr[j]=temp;
		   pivot=j;
           
	    
	    System.out.println(pivot);
	    if(k<pivot)
	    	findKthSmallEle(arr,0,pivot-1,k);
	    else if(k>pivot)
	    	findKthSmallEle(arr,pivot+1,end,k);

	    	
	    	
		if(pivot == k)
			System.out.println(arr[pivot]) ;
			}
}
