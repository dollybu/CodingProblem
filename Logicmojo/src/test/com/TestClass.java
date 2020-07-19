package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;




public class TestClass {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter wr = new PrintWriter(System.out);
         String str ="aabcccabba"; 
         	

         int out_ = string_minimization(str);
         System.out.println(out_);

         //wr.close();
         //br.close();
    }
    static int string_minimization(String str){

        int len =str.length();
        String left= str.substring(0,len/2);
        String right=str.substring(len/2,len);
        String newstr=right+left;

        Map <Character,Integer> map= new HashMap<Character,Integer>();
        int count=1;
        char temp=0;
        for(char ch:newstr.toCharArray() )
        { //char temp=0;
        int countstr=0;
        System.out.println("temp>>"+temp);
         
         if((temp - ch) == 0){
          System.out.println("ch>>"+ch);
           
           countstr++;
         }
          else{
          countstr=0;
          }
          temp = ch;
         //System.out.println("countstr>>"+temp);

          if(countstr == 2)
          {
              count++;
          }

        }

     
/*
	    Map<Character,Integer> map=new HashMap<Character,Integer>();
	    for(char ch1:newstr.toCharArray())
	    {
	    	if(map.containsKey(ch1))
	    	 map.put(ch1,map.get(ch1)+1);
	    	else
	    	map.put(ch1, 1);	
	    	
	    }
	    for (Entry<Character,Integer>entry :map.entrySet()) {
			//System.out.println(entry.getKey()+">>"+entry.getValue());
			if(entry.getValue() ==3)
			{
				count++;
			}
		}*/
     
         
    
return count;
    }
}