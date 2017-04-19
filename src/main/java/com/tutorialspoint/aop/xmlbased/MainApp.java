/**
 * 
 */
package com.tutorialspoint.aop.xmlbased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("AOP_XML_based.xml")) {
			Student student = (Student) context.getBean("student");
			student.getName();
			student.getAge();
			student.printThrowException();
		}
	}
}
