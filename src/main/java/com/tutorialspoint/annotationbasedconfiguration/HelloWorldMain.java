/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class HelloWorldMain {

	public static void main(final String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotatedBeans.xml")) {
			HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
			helloWorld.getMessage();
			context.registerShutdownHook();
		}
	}

}
