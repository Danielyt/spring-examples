/**
 * 
 */
package com.tutorialspoint.injectingcollection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {

			JavaCollection jc = (JavaCollection) context.getBean("javaCollection");

			jc.getAddressList();
			jc.getAddressSet();
			jc.getAddressMap();
			jc.getAddressProp();
		}
	}
}
