/** 
 * 
 */
package com.tutorialspoint;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class BeanScopeTest {
	
	private final ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	
	@Test
	public void testSingletonBean() {
		HelloWorld bean1 = (HelloWorld) context.getBean("singletonHelloWorld");
		assertNotNull(bean1);
		HelloWorld bean2 = (HelloWorld) context.getBean("singletonHelloWorld");
		assertNotNull(bean2);
		assertSame(bean1, bean2);
	}
	
	@Test
	public void testPrototypeBean() {
		HelloWorld bean1 = (HelloWorld) context.getBean("prototypeHelloWorld");
		assertNotNull(bean1);
		HelloWorld bean2 = (HelloWorld) context.getBean("prototypeHelloWorld");
		assertNotNull(bean2);
		assertNotSame(bean1, bean2);
	}
}
