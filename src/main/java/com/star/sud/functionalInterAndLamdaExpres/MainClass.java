/**
 * 
 */
package com.star.sud.functionalInterAndLamdaExpres;

/**
 * @author sudarshan
 *
 */
public class MainClass {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("run method with anonymous class");
			}
		};

		r1.run();

		Runnable r2 = () -> System.out.println("run method with runnable interface");
		r2.run();

		MyInterFace myint = new MyInterFace() {
			@Override
			public void getMessage(String msg) {
				System.out.println(msg);
			}
		};

		myint.getMessage("getMessage with anonymous class");

		MyInterFace lamdaExp = (msg) -> System.out.println(msg);
		lamdaExp.getMessage("getMessage with Functional Interface");

	}

}
