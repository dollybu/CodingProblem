package com.java8;

public interface Printable {
	 
	void print();
	default void printColor()
	{
		System.out.println("Printing Color copy");
	}
}
