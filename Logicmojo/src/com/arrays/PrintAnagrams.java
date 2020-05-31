package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PrintAnagrams {
	public static void main(String[] args) {
		String str[]= {"cat","dog","god","tac"};
		printAnagrams(str);
	}

	private static void printAnagrams(String[] str) {

		char char1[]= new char[26];
		Map<String, ArrayList<String>> map=new HashMap<String,ArrayList<String>>();
		for(int i=0;i<str.length;i++)
		{
			int j=0;
		  for(char c1:str[i].toCharArray())	{
             char1[j]=char1[c1-'A'];
             j++;
		  }
			String strnew=char1.toString();
			
			//map.put(strnew,new ArrayList(str[i]));
			
		}
		
	}
		
	
}
