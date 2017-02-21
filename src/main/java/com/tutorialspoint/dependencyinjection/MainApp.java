/**
 * 
 */
package com.tutorialspoint.dependencyinjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {
			TextEditor textEditor1 = (TextEditor) context.getBean("textEditorWithConstructor");
			textEditor1.spellCheck();
			TextEditor textEditor2 = (TextEditor) context.getBean("textEditorWithSetter");
			textEditor2.spellCheck();
			TextEditor textEditor3 = (TextEditor) context.getBean("textEditorWithInnerBean");
			textEditor3.spellCheck();
		}
	}
}
