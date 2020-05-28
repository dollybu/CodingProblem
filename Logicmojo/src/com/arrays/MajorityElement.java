package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
     int arr[]= {3, 3, 4, 2, 4, 4, 2, 4, 4};
	//Output : 4 and occurance =n/2;
     findMaxOcc(arr,arr.length);

	}

	private static void findMaxOcc(int[] arr, int n) {
		Map<Integer, Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			//System.out.println("test");
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1 );
			}
			else
				map.put(arr[i], 0);
		}
		int val=n/2;
	    for(Entry entry: map.entrySet())
	    {
	    	if(entry.getValue() == (Integer)val)
	    	System.out.println(entry.getKey() +" value ="+entry.getValue());
	    }
		
	}
}
