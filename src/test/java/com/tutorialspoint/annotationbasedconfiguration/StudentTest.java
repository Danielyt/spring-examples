/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class StudentTest {

	@Test
	public void givenMissingRequiredProperty_ExceptionIsThrown() {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("TestAnnotatedBeans1.xml")) {
			fail();
		} catch (BeanCreationException e) {
			assertTrue(e.getCause() instanceof BeanInitializationException);
		}
	}
}
