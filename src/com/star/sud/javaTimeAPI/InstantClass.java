/**
 * 
 */
package com.star.sud.javaTimeAPI;

import java.time.Duration;
import java.time.Instant;

/**
 * @author sudarshan
 *
 */
public class InstantClass {

	public static void main(String[] args) {

		// Current timestamp
		Instant now = Instant.now();
		System.out.println(now);

		// Instant from timestamp
		Instant ofEpochMilli = Instant.ofEpochMilli(now.toEpochMilli());
		System.out.println(ofEpochMilli);

		// Duration example
		Duration ofDays = Duration.ofDays(30);
		System.out.println(ofDays);

	}

}
