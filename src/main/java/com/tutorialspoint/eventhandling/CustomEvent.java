/**
 * 
 */
package com.tutorialspoint.eventhandling;

import org.springframework.context.ApplicationEvent;

/**
 * @author Drusev
 *
 */
public class CustomEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6546364891113863679L;

	public CustomEvent(final Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "My custom event";
	}
}
