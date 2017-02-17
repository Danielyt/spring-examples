/**
 * 
 */
package com.tutorialspoint.beandefinitioninheritance;

import org.junit.Test;
import org.springframework.beans.factory.BeanIsAbstractException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class BeanDefinitionInheritanceTest {

	@Test(expected = BeanIsAbstractException.class)
	public void test() {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {
			@SuppressWarnings("unused")
			Object bean = context.getBean("beanTemplate");
		}
	}
}
