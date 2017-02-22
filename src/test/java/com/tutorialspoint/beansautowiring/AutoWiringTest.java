/**
 * 
 */
package com.tutorialspoint.beansautowiring;

import static org.junit.Assert.assertNotNull;
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

	@Test
	public void givenOneBeanOfAppropriateType_whenAutoWiringByConstructor_itIsInjected() {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("TestBeansByConstructor1.xml")) {
			TextEditorImpl textEditor = (TextEditorImpl) context.getBean("textEditorByConstructor");
			assertNotNull(textEditor.getChecker());
		}
	}

	@Test
	public void givenTwoBeansOfAppropriateTypeWithoutMatchingNames_whenAutoWiringByConstructor_UnsatisfiedDependencyExceptionIsThrown() {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("TestBeansByConstructor2.xml")) {
			fail();
		} catch (UnsatisfiedDependencyException e) {
			assertTrue(e.getCause() instanceof NoUniqueBeanDefinitionException);
		}
	}

	@Test
	public void givenTwoBeansOfAppropriateTypeOneWithMatchingName_whenAutoWiringByConstructor_itIsInjected() {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("TestBeansByConstructor3.xml")) {
			TextEditorImpl textEditor = (TextEditorImpl) context.getBean("textEditorByConstructor");
			assertNotNull(textEditor.getChecker());
		}
	}
}
