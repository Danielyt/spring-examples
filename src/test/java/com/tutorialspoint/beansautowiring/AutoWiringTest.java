/**
 * 
 */
package com.tutorialspoint.beansautowiring;

import static org.junit.Assert.assertNull;

import org.junit.Test;
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
}
