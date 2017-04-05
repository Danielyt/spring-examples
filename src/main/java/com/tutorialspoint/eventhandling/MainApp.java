/**
 * 
 */
package com.tutorialspoint.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	public static void main(final String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("EventHandling.xml")) {
			context.start();
			HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
			obj.getMessage();
			context.stop();
		}
	}

}
