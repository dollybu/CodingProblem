package com.arrays;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Test1 
{
	
	
	public static void main(String[] args) throws Exception{
    BigInteger	bigint=new BigInteger("dolly");
     
		
		
		String str="{(([])[])[]]]}";
		char s[]=str.toCharArray();
		 //System.out.println("\n "+ ++val);
		   // Stack<Character> stk = new LinkedList<Character>();
		    Stack<Character> stk = new Stack<Character>();
		   
            System.out.println(s.length);
            String str1="Dolly@gamil.com";
            str1.contains("@gamil.c");
            
            String  s1[]= {"dolly","chanda","mony"};
            Arrays.sort(s1);
           // Integer.MIN_VALUE;
            int a[]= {1,2,3};
            float test=123;
           
            
            
           // a.length;
            for(String s2:s1)
            	System.out.println(s2);
            /*
             * 
            
            //Double valq1 =Math.sqrt(a);
		    for(int i=0;i<s.length;i++)
		    {
		    	//System.out.println(">>>>"+s[i]);
		        if(s[i]=='(' )
		            stk.push(')');
		        if(s[i]=='[')
		            stk.push(']');
		        if(s[i]=='{')
		            stk.push('}');
		        
		        if (s[i] == '}' || s[i] == ')' || s[i] == ']') {
		            if (!stk.empty() && stk.lastElement() == s[i])
		                stk.pop();
		            else 
		    		    System.out.println("No");
		            stk.peek();

		        }
		    }

		    String result= stk.empty() ? "YES" : "NO";
		    System.out.println("resul"+result);
		    
		    try {
		    	
		    }
		    catch (Exception e) {
				// TODO: handle exception
			}*/
		
	}
	
}

