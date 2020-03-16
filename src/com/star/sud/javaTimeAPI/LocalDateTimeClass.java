/**
 * 
 */
package com.star.sud.javaTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * @author sudarshan
 *
 */
public class LocalDateTimeClass {

	public static void main(String[] args) {

		// Current Date
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		// Current Date using LocalDate and LocalTime
		LocalDateTime of = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(of);

		// Creating LocalDateTime by providing input arguments
		LocalDateTime of2 = LocalDateTime.of(2020, 03, 16, 12, 15, 40, 40);
		System.out.println(of2);

		// Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDateTime now2 = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(now2);

		// Getting date from the base date i.e 01/01/1970
		LocalDateTime dateFromBase = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
		System.out.println("10000th second time from 01/01/1970= " + dateFromBase);

	}

}
