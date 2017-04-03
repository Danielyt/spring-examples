/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class TextEditorMain {

	public static void main(final String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("AnnotatedBeans.xml")) {
			TextEditorWithSetter textEditorWithSetter = (TextEditorWithSetter) context.getBean("textEditorWithSetter");
			textEditorWithSetter.spellCheck();

			TextEditorWithProperty textEditorWithProperty = (TextEditorWithProperty) context
					.getBean("textEditorWithProperty");
			textEditorWithProperty.spellCheck();

			TextEditorWithConstructor textEditorWithConstructor = (TextEditorWithConstructor) context
					.getBean("textEditorWithConstructor");
			textEditorWithConstructor.spellCheck();
		}
	}
}
