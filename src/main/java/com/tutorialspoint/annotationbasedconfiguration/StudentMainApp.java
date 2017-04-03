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
public class StudentMainApp {

	public static void main(final String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotatedBeans.xml")) {

			Student student = (Student) context.getBean("student");
			System.out.println("Name: " + student.getName());
			System.out.println("Age: " + student.getAge());

			AutowiredStudent autowiredStudent = (AutowiredStudent) context.getBean("autowiredStudent");
			System.out.println("Name: " + autowiredStudent.getName());
			System.out.println("Age: " + autowiredStudent.getAge());
		}
	}

}
