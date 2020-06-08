package com.binarytree;

import java.util.HashSet;
import java.util.Scanner;

class InvalidInputException extends Exception {
    
}

class Employee {
   
   private int id = 0;
   private String name = null;
   private boolean male = true;
    
    Employee(int id, String name,  boolean male) {
       super();
       this.id = id;
       this.name = name;
       this.male = male;
   }
     
   @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ",  male=" + male + "]";
    }   
    
    @Override
    public int hashCode() {
        // Complete all relevent code
    	final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
    }
       
   
}

public class Test {
    
    /*
    * Validate the input and create Employee object
    * If any of the given input is not valid throw InvalidInputException();
    */
    public Employee createEmployee(String record) throws InvalidInputException {
        
        //Complete the code
    	Employee employee =null;
    	try {
    		String[] records = record.split(",");
    		if(records.length != 3)
    			throw new InvalidInputException();
    		
    		 employee = new Employee(Integer.parseInt(records[0]), records[1].toString(), Boolean.valueOf(records[2]));
    		
    	}catch(Exception ex) {
    		throw new InvalidInputException();
    	}
    	
    	return employee;
    	
                
    }
    
    public static void main(String[] str) {
        
        //Input is expected as comma separated values for Employee object like id(int), name (String),isMale(boolean)"
        // 1,John,true
        Scanner scan = new Scanner(System.in);
        
        HashSet<Employee> employeeSet = new HashSet<>();
        
        //Process each line and create Employee object using the "createEmployee" method add in employeeSet/
        while (true) {
            try {
                //Complete the code
            	String record = scan.nextLine();
            	if(record == null || record.equals(""))
            		break;
            	Employee employee = new Test().createEmployee(record);
            	employeeSet.add(employee);
            	
            }catch(Exception e) {
                System.out.println(e.getClass().getName());
                System.exit(0);
            }
         
        }
        
        //Don't delete or modify this print statement
        System.out.println("Employees info : "+ employeeSet);
   
    }

}