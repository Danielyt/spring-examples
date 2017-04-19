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
public class CustomMainApp {

	public static void main(final String[] args) {
		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("CustomEventHandling.xml")) {
			CustomEventPublisher publisher = (CustomEventPublisher) context.getBean("customEventPublisher");

			publisher.publish();
			publisher.publish();
		}
	}

}
