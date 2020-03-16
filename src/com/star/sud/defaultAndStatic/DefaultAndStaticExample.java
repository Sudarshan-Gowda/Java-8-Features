/**
 * 
 */
package com.star.sud.defaultAndStatic;

/**
 * @author sudarshan
 *
 */
public class DefaultAndStaticExample implements Interface1, Interface2 {

	public static void main(String[] args) {
		DefaultAndStaticExample myClass = new DefaultAndStaticExample();
		myClass.log("Hello guys ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.star.sud.defaultAndStatic.Interface2#method2(java.lang.String)
	 */
	@Override
	public void method2(String msg) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.star.sud.defaultAndStatic.Interface1#method1(java.lang.String)
	 */
	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.star.sud.defaultAndStatic.Interface2#log(java.lang.String)
	 */
	@Override
	public void log(String msg) {
		System.out.println("MyCalss Logging " + msg);
		Interface1.print("Welcome to Java 8");
	}

}
