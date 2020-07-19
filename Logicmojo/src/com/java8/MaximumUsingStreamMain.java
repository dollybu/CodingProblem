package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//public class Maximun {

	
	public class MaximumUsingStreamMain {
		public static void main(String args[])
		{
			List<Employee> employeeList = createEmployeeList();
			List<String> employeeFilteredList = employeeList.stream()
			          .filter(e->e.getAge()>20)
			          .map(Employee::getName)
			          .collect(Collectors.toList());
			
			//employeeFilteredList.forEach((name)-> System.out.println(name));
			
			List<String> employeeFilteredList1 = employeeList.stream()
					                              .map(Employee :: getName)
					                              .collect(Collectors.toList());

					                              
			String employeeNamesStr = String.join(",", employeeFilteredList1);
			//System.out.println("Employees are: "+employeeNamesStr);

		//	System.out.println(employeeNamesStr);			
			
			Map<String, List<Employee>> map = employeeList.stream()
                    .collect(Collectors.groupingBy(Employee::getName));
                     map.forEach((name,employeeListTemp)->System.out.println("Name: "+name+" ==>"+employeeListTemp));

             	 Optional<Employee> emp= employeeList.stream()
       		          .filter(e->e.getName().equalsIgnoreCase("Mary")).findAny();
                     

         		if(emp.isPresent())
        			System.out.println(emp.get());

             	 
                     Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
                     List <Integer> listdup= Arrays.asList(arr);
                     Set<Integer> uniqueList = listdup.stream().collect(Collectors.toSet());
                     //uniqueList.forEach((i)--> System.out.println(i));
                     //uniqueList.forEach((i)->System.out.print(" "+i));
                     
                     
                     
                     
                    Integer[] arr1=new Integer[]{100,24,13,44,114,200,40,112};
             		List<Integer> list = Arrays.asList(arr1);
             		OptionalDouble average = list.stream()
             				                 .mapToInt(n->n*n)
             				                 .filter(n->n>10000)
             				                 .average();
             		
             		//if(average.isPresent())
             			//System.out.println(average.getAsDouble());
             		

                     
				}
		
		public static List<Employee> createEmployeeList()
		{
			List<Employee> employeeList=new ArrayList<>();
	 
			Employee e1=new Employee("Mary",21);
			Employee e2=new Employee("Martin",19);
			Employee e3=new Employee("Mary",31);
			Employee e4=new Employee("Stephan",18);
			Employee e5=new Employee("Gary",26);
	 
			employeeList.add(e1);
			employeeList.add(e2);
			employeeList.add(e3);
			employeeList.add(e4);
			employeeList.add(e5);
	 
			return employeeList;
		}
	}
	 


//}
