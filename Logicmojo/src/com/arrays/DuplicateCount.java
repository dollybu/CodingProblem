package com.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCount {

	public static void main(String[] args) {
	  String s1= "manhattan";
	  getOccurance(s1);
	}

	private static void getOccurance(String s1) {
		char ch[]=s1.toCharArray();
	    Map<Character,Integer> map=new HashMap<Character,Integer>();
	    for(char ch1:ch)
	    {
	    	if(map.containsKey(ch1))
	    	 map.put(ch1,map.get(ch1)+1);
	    	else
	    	map.put(ch1, 1);	
	    	
	    }
     for (Entry<Character,Integer>entry :map.entrySet()) {
		System.out.println(entry.getKey()+">>"+entry.getValue());
	}
	    
	}
	
}
