/**
 * 
 */
package com.star.sud.javastreamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author sudarshan
 *
 */
public class TestClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// A. Creating Java Stream

		// 1. Stream.of() method
		Stream<Integer> stream = Stream.of(1, 2, 3, 4);
		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3, 4 });

		// 2. Not Supported for primitive
		// Stream<Integer> stream3 = Stream.of(new int[] { 1, 2, 3, 4 });

		// 3. Sequential & parallel Stream
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);

		Stream<Integer> stream3 = myList.stream();
		Stream<Integer> parallelStream = myList.parallelStream();

		// 4. generate/Iterate Stream
		Stream<String> generate = Stream.generate(() -> {
			return "abc";
		});

		Stream<String> iterate = Stream.iterate("abc", (i) -> i);

		// 5. stream and char methods
		LongStream stream4 = Arrays.stream(new long[] { 1, 2, 3, 4 });
		IntStream chars = "abc".chars();

		// B. Converting Java Stream to Collection or Array

		// 1. collect()
		// i. list
		Stream<Integer> of = Stream.of(1, 2, 3, 4, 5);
		List<Integer> collect = of.collect(Collectors.toList());
		System.out.println("Using toList() " + collect);

		// ii. map
		Stream<Integer> of2 = Stream.of(1, 2, 3, 4, 5);
		Map<Integer, Integer> collect2 = of2.collect(Collectors.toMap(i -> i, i -> i + 10));
		System.out.println("Using toMap() " + collect2);

		// 2. toArray()
		Stream<Integer> of3 = Stream.of(1, 2, 3, 4, 5);
		Integer[] array = of3.toArray(Integer[]::new);
		System.out.println("Using toArray() " + Arrays.toString(array));

		// C. Java Stream Intermediate Operations
		// 1. Stream filter() example
		List<Integer> intArrays = new ArrayList<>();
		for (int i = 0; i < 100; i++)
			intArrays.add(i);

		Stream<Integer> stream5 = intArrays.stream();
		Stream<Integer> filter = stream5.filter(i -> i > 90);
		filter.forEach(p -> System.out.print(p + " "));

		// 2. stream map() Example
		Stream<String> of4 = Stream.of("np", "sudarshan", "gowda");
		List<String> collect3 = of4.map(s -> {
			return s.toUpperCase();
		}).collect(Collectors.toList());
		System.out.println(collect3);

		// 3. sorted() example
		Stream<String> of5 = Stream.of("np", "sudarshan", "gowda");
		List<String> collect4 = of5.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect4);

		Stream<String> of6 = Stream.of("np", "sudarshan", "gowda");
		List<String> collect5 = of6.sorted().collect(Collectors.toList());
		System.out.println(collect5);

		// 4. flatMap() example
		Stream<List<String>> of7 = Stream.of(Arrays.asList("Sudarshan"), Arrays.asList("Gowda", "John"),
				Arrays.asList("Meera", "joo"));

		Stream<String> flatMap = of7.flatMap(strList -> strList.stream());
		flatMap.forEach(System.out::println);

		// d. Java Stream Terminal Operation
		// 1. reduce() example
		Stream<Integer> of8 = Stream.of(1, 2, 3, 4, 5);
		Optional<Integer> reduce = of8.reduce((i, j) -> {
			return i * j;
		});

		if (reduce.isPresent())
			System.out.println("Multiplication =" + reduce.get());

		// 2. count()
		Stream<Integer> of9 = Stream.of(1, 2, 3, 4);
		System.out.println(of9.count());

		// 3. forEach()
		Stream<Integer> of10 = Stream.of(1, 2, 3, 4);
		of10.forEach(i -> System.out.print(i + " "));

		// 4. match()
		Stream<Integer> of11 = Stream.of(1, 2, 3, 8, 5);
		boolean anyMatch = of11.anyMatch(i -> i == 4);
		System.out.println("Any match found for 4 " + anyMatch);

		Stream<Integer> of12 = Stream.of(1, 2, 3, 8, 5);
		boolean allMatch = of12.allMatch(i -> i < 10);
		System.out.println("All match found with <10 ->" + allMatch);

		Stream<Integer> of13 = Stream.of(1, 2, 3, 8, 5);
		boolean noneMatch = of13.noneMatch(i -> i > 10);
		System.out.println("none match found with <10 ->" + noneMatch);

		Stream<Integer> of14 = Stream.of(1, 2, 3, 8, 5);
		Optional<Integer> findFirst = of14.findFirst();
		System.out.println("findFirst ->" + findFirst);

	}

}
