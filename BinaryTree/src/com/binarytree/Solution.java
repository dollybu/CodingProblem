package com.binarytree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        
        boolean isBalanced = false;
        
        /* Enter your code here */
        
        isBalanced=true;

        if (null == inputString || ((inputString.length() % 2) != 0)) {
        	isBalanced= false;
        } else {
            char[] ch = inputString.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                	isBalanced= false;
                }

            }
        }

        while (inputString.contains("()") || inputString.contains("[]") || inputString.contains("{}")) {
        	inputString = inputString.replaceAll("\\(\\)", "")
                .replaceAll("\\[\\]", "")
                .replaceAll("\\{\\}", "");
        }
        isBalanced= (inputString.length() == 0);

    
        
        
        if(isBalanced){
            System.out.println("Balanced");
        } else {      
            System.out.println("Not Balanced");
        }
    }
}
