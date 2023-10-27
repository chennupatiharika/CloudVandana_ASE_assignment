package com.jsp.edu.javaAssignment;
import java.util.*;
public class ShuffleArray {

	public static void main(String[] args) {
		HashSet h = new HashSet(); // hashset collection follows hashing technique to store elements, it doesn't follow insertion order,so while fetching it will give random order
		int[] array = {1,11,33,54,75,6,57,8,9};
		for(int a:array)
		{
			h.add(a);
		}
		System.out.println(h);

	}

}
