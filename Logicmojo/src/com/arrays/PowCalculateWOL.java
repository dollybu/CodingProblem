package com.arrays;

public class PowCalculateWOL {
	
	//will use divide conqure approach to solve this problem 
	
	public static void main(String[] args) {
		
	   System.out.println(powCal(50,3));
		
	}

	private static int powCal(int num, int pow) 
	{
		int result;
		if(pow == 0) return 1;
		result= powCal(num, pow/2);
		if(pow%2 == 0)
		return result*result;
		else
		
		return num*result*result;
	}
		
		

}
