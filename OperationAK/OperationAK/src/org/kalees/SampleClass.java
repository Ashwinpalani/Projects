package org.kalees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleClass {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> l = new ArrayList<>(Arrays.asList(8, 2, 4, 6));
		l.add(7);
		l.indexOf(0);
		boolean contains = l.contains(8);
		l.remove(2);
		l.set(3,2);
		System.out.println(l+ "\nans = " + l.equals(contains));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
