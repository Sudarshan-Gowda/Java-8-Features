/**
 * 
 */
package com.star.sud.defaultAndStatic;

/**
 * @author sudarshan
 *
 */
public interface Interface2 {

	void method2(String msg);

	default void log(String msg) {
		System.out.println("I2 logging - " + msg);
	}

}
