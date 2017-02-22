/**
 * 
 */
package com.tutorialspoint.beansautowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	public static void main(String[] args) {
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml")) {
			TextEditorImpl textEditor1 = (TextEditorImpl) context.getBean("textEditorByName");
			textEditor1.spellCheck();
			TextEditorImpl textEditor2 = (TextEditorImpl) context.getBean("textEditorByConstructor");
			textEditor2.spellCheck();
		}
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeansByType.xml")) {
			TextEditorImpl te = (TextEditorImpl) context.getBean("textEditorByType");
			te.spellCheck();
		}
	}
}
