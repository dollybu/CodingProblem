package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class Test implements Runnable{
public void run() {
	System.out.println(" inside run");	
}

	public static void main(String[] args) {

		List<Integer> list= new ArrayList<Integer>();
		list.add(3,1);
		System.out.println(list);
	}
}
