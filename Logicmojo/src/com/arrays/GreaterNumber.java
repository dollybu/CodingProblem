package com.arrays;

import java.util.Arrays;


public class GreaterNumber {

	public static void main(String[] args) {
		//int a[]= {2,1,8,7,6,5};
		//out - 251678
		
		int a[]= {5,3,4,9,7,6};
		//out - 536479

		int b[]=getGreaterNumber(a,a.length);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
	}

	private static int[] getGreaterNumber(int[] a,int n) {
//Find out immediate creditor number and sort right side result
		int i=0;
		for(i=n-1;i>0;i--)
		{
			if(a[i]>a[i-1])
			break;
			
		}
		int element =a[i-1],min=i;
		for(int j=i+1;j<n ;j++)
		{
			
			if(a[j]>element && a[j]<a[min])
			{
				min=j;
			}
		}
		
	    int temp =a[i-1];
	     a[i-1]=a[min];
	     a[min]=temp;
	     Arrays.sort(a,1,n);
		
		return a;
	}
}
