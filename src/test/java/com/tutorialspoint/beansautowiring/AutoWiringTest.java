/**
 * 
 */
package com.tutorialspoint.beansautowiring;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.UnsatisfiedDependencyException;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class AutoWiringTest {

	@Test
	public void givenWrongNameWhenAutoWiringByName_NullIsInjected() {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("TestBeans.xml")) {
			TextEditorImpl textEditor = (TextEditorImpl) context.getBean("textEditorWithWrongPropertyName");
			assertNull(textEditor.getChecker());
		}
	}

	@Test
	public void givenMultipleBeansOfSameTypeWhenAutoWiringByType_UnsatisfiedDependencyExceptionIsThrown() {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("TestBeansByType.xml")) {
			fail();
		} catch (UnsatisfiedDependencyException e) {
			assertTrue(e.getCause() instanceof NoUniqueBeanDefinitionException);
		}
	}
}
