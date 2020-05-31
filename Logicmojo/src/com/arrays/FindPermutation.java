package com.arrays;

public class FindPermutation {

	public static void main(String[] args) {
		String word="ABC";
		stringPermutation(word,0,2);
	}

	private static void stringPermutation(String word, int start, int end) {
	
		if(start == end)
		{
			System.out.println(word);
		}
		else
		{
			for(int index=start;index<=end;index++)
			{
			   	word=swap(word,start,index);
				stringPermutation(word, start+1, end);
				word=swap(word,start,index);
			}
		
		}
		
	}

	private static String swap(String word, int start, int index) {
		char ch[]=word.toCharArray();
		char temp=ch[start];
		   ch[start]=ch[index];
		   ch[index]=temp;
		   word= new String(ch);
		   return word;
		
	}
}
