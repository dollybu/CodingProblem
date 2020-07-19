package com.java8;

public class FunctionalIntefaceMain {
	 
	public static void main(String[] args)
	{
		FunctionalIntefaceMain pMain=new FunctionalIntefaceMain();
		pMain.printForm(() -> System.out.println("Printing form12"));
	}
	
	public void printForm(Printable p)
	{
		p.print();
	}
}
