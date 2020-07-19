package com.arrays;

public class LeapYear {

	public static void main(String[] args) {
		int n=1900;
		//(input) - 1900,2000,2004,1600,1608,1500

		findLeapyear(n);
	}
	//IF(OR(MOD(A1,400)=0,AND(MOD(A1,4)=0,MOD(A1,100)<>0)),"Leap Year", "NOT a Leap Year")  


	private static void findLeapyear(int n) {
        if((n%4 == 0 && n%100!=0)||(n%400 ==0))
        {
        	System.out.println(" Is leap year");
        }
        else 
        	System.out.println("Non Leap");
		
	}
}
