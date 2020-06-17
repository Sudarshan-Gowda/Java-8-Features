/**
 * 
 */
package com.star.sud.javaTimeAPI;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * @author sudarshan
 *
 */
public class LocalDateClass {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Current Date=" + date);

		LocalDate of = LocalDate.of(2010, Month.MAY, 01);
		System.out.println("Specific Date=" + of);

		// LocalDate of1 = LocalDate.of(2011, Month.FEBRUARY, 29);
		// System.out.println(of1);

		LocalDate now = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST=" + now);

		// LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
		// System.out.println(todayIST);

		LocalDate ofEpochDay = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= " + ofEpochDay);

		LocalDate ofYearDay = LocalDate.ofYearDay(2000, 100);
		System.out.println("100th day of 2000=" + ofYearDay);

	}

}
