package com.jsp.edu.javaAssignment;
//import java.io.*;  
import java.util.*;  
  
public class RomanToInteger {
	
	    public static void convertRomanToInt(String s)  
	    {  
	        Map<Character, Integer> map=new HashMap<Character, Integer>();  
	        //adding elements to the Map  collection as key: value pair 
	        map.put('I',1);  
	        map.put('V',5);  
	        map.put('X',10);  
	        map.put('L',50);  
	        map.put('C',100);  
	        map.put('D',500);  
	        map.put('M',1000);    
	        s = s.replace("IV","IIII");  
	        s = s.replace("IX","VIIII");  
	        s = s.replace("XL","XXXX");  
	        s = s.replace("XC","LXXXX");  
	        s = s.replace("CD","CCCC");  
	        s = s.replace("CM","DCCCC");  
	        int number = 0;   // final number outut variable
	    //loop iterates over the roman numeral which is String   
	        for (int i = 0; i < s.length(); i++)  
	        {  
	    //getting each character of roman numeral and  fetching the corresponding int value from map and adding it to the variable number  
	            number = number + (map.get(s.charAt(i)));  
	        }  
	        //prints the corresponding integer value  
	        System.out.println("The corresponding Integer value is: "+number);  
	}  
	    //Test code  
	    public static void main (String args[])  
	    {  
	        //function calling  
	        convertRomanToInt("MCMX");  
	    }  
	  
	}  

