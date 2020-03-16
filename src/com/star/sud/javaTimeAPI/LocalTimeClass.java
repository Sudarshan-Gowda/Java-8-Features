/**
 * 
 */
package com.star.sud.javaTimeAPI;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 * @author sudarshan
 *
 */
public class LocalTimeClass {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println(now);

		LocalTime now2 = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(now2);

		LocalTime now3 = LocalTime.of(07, 11, 57, 40);
		System.out.println(now3);

		LocalTime ofSecondOfDay = LocalTime.ofSecondOfDay(00100);
		System.out.println(ofSecondOfDay);
		
		

	}

}
