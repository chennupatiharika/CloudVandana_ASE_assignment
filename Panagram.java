package com.jsp.edu.javaAssignment;
import java.util.*;
public class Panagram {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter string: ");
		String s = scn.nextLine();
		char[] ch = s.toCharArray();
		int[] count = new int[26]; // create a int array of size 26 to push each char count into it
		for(char c: ch)
		{
			int index = c-'a'; // to get particular alphabet index
			count[index]++;
		}
		boolean flag  = true;
		for(int n:count)
		{
			if(n==0) // check wheather atleast one index is zero , then its not panagram.
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("Panagram");
		}
		else
		{
			System.out.println("Not an Panagram");
		}
		
scn.close();
	}

}
