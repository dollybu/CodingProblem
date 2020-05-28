package com.arrays;

public class FindPairSum {
	public static void main(String[] args) {
    int arr[] = {0, -1, 2, -3, -1};
    int sum = -2;
    findPairSum(arr,sum);

	}

	private static void findPairSum(int[] arr, int sum) {
		boolean flag=false;
      for(int i=1;i<arr.length;i++)
      {
    	  
    	  if(sum == (arr[i-1]+arr[i])) {
    		  flag=true;
    		System.out.println("Sum is exist index "+sum+"= "+arr[i-1]+"+ "+arr[i]);  
    	  }

      }
      if(!flag)
    	  System.out.println("Sum is not exist");
		
	}

}
