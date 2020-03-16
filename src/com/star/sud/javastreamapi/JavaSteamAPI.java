/**
 * 
 */
package com.star.sud.javastreamapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sudarshan
 *
 */
public class JavaSteamAPI {

	public static void main(String[] args) {

		List<Integer> intArrays = new ArrayList<Integer>();
		for (int i = 6; i < 15; i++)
			intArrays.add(i);

		sumIteratorBeforeJava8(intArrays);

		sumIteratorUsingJava8(intArrays);

	}

	/**
	 * Get the sum of integers which are more than 9
	 */
	private static void sumIteratorBeforeJava8(List<Integer> intArrays) {

		int sum = 0;

		Iterator<Integer> iterator = intArrays.iterator();
		while (iterator.hasNext()) {
			int curVal = iterator.next();
			if (curVal > 9)
				sum += curVal;
		}

		System.out.println("Sum of integers before Java-8: " + sum);

	}

	private static void sumIteratorUsingJava8(List<Integer> intArrays) {

		int sum = intArrays.stream().filter(i -> i > 9).mapToInt(i -> i).sum();
		System.out.println("Sum of Integer using Java-8: " + sum);

	}

}
