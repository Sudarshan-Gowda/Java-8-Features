/**
 * 
 */
package com.star.sud.functionalInterAndLamdaExpres;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author sudarshan
 *
 */
public class LamdaExpressionForJavaStreamAPI2 {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		for (int j = 0; j < 15; j++)
			numbers.add(j);

		int rst = findSquareOfMaxOdd(numbers);
		System.out.println(rst);
		rst = findSquareOfMaxOddLamda(numbers);
		System.out.println(rst);

	}

	private static int findSquareOfMaxOdd(List<Integer> numbers) {

		long startTime = System.nanoTime();

		int max = 0;
		for (int i : numbers) {
			if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
				max = i;
			}
		}

		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds  : " + timeElapsed);
		System.out.println("Execution time in milliseconds : " + timeElapsed / 1000000);

		return max * max;
	}

	public static int findSquareOfMaxOddLamda(List<Integer> numbers) {

		return numbers.stream().filter(NumberTest::isOdd) // Predicate is functional interface and
				.filter(NumberTest::isGreaterThan3) // we are using lambdas to initialize it
				.filter(NumberTest::isLessThan11) // rather than anonymous inner classes
				.max(Comparator.naturalOrder()).map(i -> i * i).get();
	}

}
