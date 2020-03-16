/**
 * 
 */
package com.star.sud.functionalInterAndLamdaExpres;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * @author sudarshan
 *
 */
public class LamdaExpressionForJavaStreamAPI {

	public static void main(String[] args) {

		// System.out.println(isPrime(23));
		// System.out.println(isPrimeLamda(23));

		// sum of all numbers
		List<Integer> numbers = new ArrayList<Integer>();
		for (int j = 0; j < 15; j++)
			numbers.add(j);
		int sumWhCondition = sumWithCondition(numbers, n -> true);
		System.out.println(sumWhCondition);
		// sum of all even numbers
		sumWhCondition = sumWithCondition(numbers, i -> i % 2 == 0);
		System.out.println(sumWhCondition);
		// sum of all numbers greater than 5
		sumWhCondition = sumWithCondition(numbers, i -> i > 5);
		System.out.println(sumWhCondition);
	}

	public static Boolean isPrime(int num) {

		if (num < 2)
			return false;

		for (int i = 2; i < num; i++) {
			if (num % 2 == 0)
				return false;
		}

		return true;
	}

	public static boolean isPrimeLamda(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);
	}

	public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {

		return numbers.parallelStream().filter(predicate).mapToInt(i -> i).sum();
	}

}
