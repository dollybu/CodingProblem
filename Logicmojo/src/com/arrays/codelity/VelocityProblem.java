package com.arrays.codelity;

public class VelocityProblem {

	
	static int stablePeriods(int[] nums) {
	    int ans = 0;
	    for (int i = 1; i < nums.length; i++) {
	        int length = 0;
	        int diff = nums[i] - nums[i - 1];
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] - nums[j - 1] != diff) break;
	            length++;
	        }
	        ans += (length * (length + 1))/2;
	        i += length;
	    }
	    return ans;
	}

	public static void main(String[] args) {
		int[] arr = {-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
		System.out.println(stablePeriods(arr));
		int[] arr1 = {1,2,3,4,5,6};
		System.out.println(stablePeriods(arr1));
	}

}
