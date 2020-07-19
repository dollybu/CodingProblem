package com.binarytree;

import java.util.Set;
import java.util.TreeSet;

class Myclass extends Thread
{
	
	Myclass()
	{
		System.out.println("constructor");
	}
	
	@Override
	public void run() {
      System.out.println("run");
	}
	
	public void run(String s)
	{
		System.out.println("Method Run");
	}
	
	
}
public class MyclassB 
{
	public static void main(String[] args) {
		
		Thread t1=new Myclass()
				
				{ @Override
			    
					public void run() {
					System.out.println("Hi");
						
					}
				
			
			
			
				};
				t1.start();
		
	}
	
	
}