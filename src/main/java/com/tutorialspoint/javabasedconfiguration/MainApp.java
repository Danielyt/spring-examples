/**
 * 
 */
package com.tutorialspoint.javabasedconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {

	public static void main(final String[] args) {
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class,
				TextEditorConfig.class)) {
			HelloWorld helloWorld = context.getBean(HelloWorld.class);
			helloWorld.setMessage("Hello World!");
			helloWorld.getMessage();

			TextEditor textEditor = context.getBean(TextEditor.class);
			textEditor.spellCheck();
		}
	}

}
