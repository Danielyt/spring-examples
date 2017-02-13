/**
 * 
 */
package com.tutorialspoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Drusev
 *
 */
public class MainAppWithXMLBeanFactory {
	
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();
	}
}
