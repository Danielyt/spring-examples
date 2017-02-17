/**
 * 
 */
package com.tutorialspoint.beandefinitioninheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {

			HelloWorld objA = (HelloWorld) context.getBean("parentHelloWorld");

			objA.getMessage1();
			objA.getMessage2();

			HelloIndia objB = (HelloIndia) context.getBean("childHelloIndia");
			objB.getMessage1();
			objB.getMessage2();
			objB.getMessage3();
		}
	}
}
