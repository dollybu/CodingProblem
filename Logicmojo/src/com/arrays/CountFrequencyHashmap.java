package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountFrequencyHashmap {

	public static void main(String[] args) {
		int arr[]= {1,2,2,5,7,1};
		PrintFrquency(arr,arr.length);
		
		
	}

	private static void PrintFrquency(int[] arr, int n) {
    
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],1);
			}
				
		}
		
		for(Entry entry:map.entrySet())
		{
			System.out.println(entry.getKey()+" value: "+entry.getValue());
		}
	}
}
