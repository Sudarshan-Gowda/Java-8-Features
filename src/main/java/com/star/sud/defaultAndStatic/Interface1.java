/**
 * 
 */
package com.star.sud.defaultAndStatic;

/**
 * @author sudarshan
 *
 */
@FunctionalInterface
public interface Interface1 {

	void method1(String str);

	default void log(String msg) {
		System.out.println("I1 log - " + msg);
	}

	static void print(String str) {
		System.out.println("Printing Details " + str);
	}

}
