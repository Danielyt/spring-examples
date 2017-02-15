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
@SuppressWarnings("deprecation")
public class MainAppWithXMLBeanFactory {
	
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		obj.getMessage();
	}
}
