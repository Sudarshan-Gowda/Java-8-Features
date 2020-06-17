/**
 * 
 */
package com.star.sud.javastreamapi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sudarshan
 *
 */
public class JavaStreamAPIExample {

	public static void main(String[] args) {

		javaStreamAPI();
	}

	static void javaStreamAPI() {
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			myList.add(i);
		}

		System.out.println("Sequential Stream");
		myList.stream().filter(i -> i > 90).forEach(k -> System.out.print(k + " "));

		System.out.println("Parallel Stream");
		myList.parallelStream().filter(j -> j > 90).forEach(m -> System.out.print(m + " "));

	}

}
