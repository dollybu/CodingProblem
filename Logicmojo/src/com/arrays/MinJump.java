package com.arrays;

public class MinJump {

	public static void main(String[] args) {
		int a[]= {1,3,5,8,12};
		System.out.println(getMinJump(a));
	}

	private static int getMinJump(int[] a) {

		int maxVal=a[0];
		int step=a[0];
		int jump=1;
		
		for(int i=1;i<a.length;i++)
		{
			if(i == a.length)
				return jump;
			maxVal=Math.max(maxVal,a[i]+i);
			step--;
			//System.out.println(maxVal);
			
			if(step == 0)
			{
				
				jump++;
				
				if(i>=maxVal)
					return -1;
				
				step=maxVal -1;
				
			 }
			
		}
		
		
		
		return jump;
	}
}
