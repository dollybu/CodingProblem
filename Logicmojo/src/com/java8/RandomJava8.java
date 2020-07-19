package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Stream;


public class RandomJava8 {

	
	public static void main(String[] args) {
	    // random number      
		//random();
		
		//sum ArrayList
		
		List<Integer> list=new ArrayList<Integer>() ;
		    list.add(20);
		    list.add(2);
		    list.add(3);
		    list.add(1);
		    list.add(2);
		    sum(list); 
		    square(list);
		  
			List<String> list1=new ArrayList<String>() ;
		    list1.add("dolly");
		    list1.add("bundiwal");
		    list1.add("chanda");
		    list1.add("Modi");
		    list1.add("dolly78");
		    strLength(list1);
		    
		    findMaxMin(list);
	        List<String> list11 = Arrays.asList("Java", "8");
	        List<String> list22 = Arrays.asList("explained", "through", "programs");

		    stringConcate(list11,list22);
		    
		    
		    
		    
		
}
	
	//Q #39) Write a Java 8 program to concatenate two Streams?

	private static void stringConcate(List<String> list11, List<String> list22) {
		System.out.println("======= Concate Start ========== ");
		Stream.concat(list11.stream(), list22.stream()).forEach(System.out::println);
		System.out.println("======= Concate End ========== ");

		
		
	}




	
	// Write a Java 8 program to find the lowest and highest number of a Stream?
	
private static void findMaxMin(List<Integer> list) {
		
	  Optional<Integer> maxvalue= list.stream().max(Comparator.comparing(Integer ::valueOf));
	  if(maxvalue.isPresent())
	   System.out.println("max  "+maxvalue.get());
	   
	   Optional<Integer> minvalue=  list.stream().min(Comparator.comparing(Integer ::valueOf));
	   if(minvalue.isPresent())
	   System.out.println("min   "+minvalue.get());

	}

private static void strLength(List<String> list1) {
		 list1.stream().filter(i -> i.length()>5).map(i ->i).forEach(System.out::println);
	
	}

//Write a Java 8 program to find the number of Strings in a list whose length is greater than 5?


	
	
	
//Write a Java 8 program to square the list of numbers and then filter out the numbers greater than 100 and 
//	then find the average of the remaining numbers?
	
private static void square(List<Integer> list) {
	 OptionalDouble sum =list.stream().mapToInt(i ->i*i).filter( i ->i >100).average();
	  if(sum.isPresent())
		  System.out.println(sum);
}


//Write a program to print 5 random numbers in sorted order using forEach in Java 8?
private static void sum(List<Integer> list) {
	   int sum =list.stream().mapToInt(i ->i).sum();	
	   System.out.println(sum);
	}








static void random()
	{
		Random random= new Random();
		random.ints().limit(5).sorted().forEach(System.out::println);
		

	}
}
