/**
 * 
 */
package com.tutorialspoint.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {
			HelloWorld obj = (HelloWorld) context.getBean("lifeCycledHelloWorld");
			obj.getMessage();
			System.out.println(obj.getClass());
			context.registerShutdownHook();
		}
	}
}
