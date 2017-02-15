package com.tutorialspoint.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Drusev
 *
 */
public class HelloWorld implements InitializingBean, DisposableBean {
	
	private String message;
	
	public HelloWorld() {
		System.out.println("Inside constructor, value of message: " + message);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("inside afterPropertiesSet, value of message: " + message);		
	}

	public void init() {
		System.out.println("inside init, value of message: " + message);		
	}
	
	public void destroy() throws Exception {
		System.out.println("inside destroy");
	}
	
	public void xmlDefinedDestroy() {
		System.out.println("inside xmlDefinedDestroy");
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your message: " + message);
	}
}
