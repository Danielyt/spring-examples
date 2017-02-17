package com.tutorialspoint.beandefinitioninheritance;

/**
 * @author Drusev
 *
 */
public class HelloWorld {

	private String message1;

	private String message2;

	public void getMessage1() {
		System.out.println("World message1: " + message1);
	}

	public void setMessage1(final String message1) {
		this.message1 = message1;
	}

	public void getMessage2() {
		System.out.println("World message2: " + message2);
	}

	public void setMessage2(final String message2) {
		this.message2 = message2;
	}

}
