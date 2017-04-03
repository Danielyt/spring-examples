package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class ProfileMain {

	public static void main(final String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotatedBeans.xml")) {
			Profile profile = (Profile) context.getBean("profile");
			profile.printName();
			profile.printAge();
		}
	}
}
