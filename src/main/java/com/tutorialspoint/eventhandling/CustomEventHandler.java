/**
 * 
 */
package com.tutorialspoint.eventhandling;

import org.springframework.context.ApplicationListener;

/**
 * @author Drusev
 *
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(final CustomEvent event) {
		System.out.println(event);
	}
}
