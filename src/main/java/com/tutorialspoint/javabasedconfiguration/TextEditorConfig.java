/**
 * 
 */
package com.tutorialspoint.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Drusev
 *
 */
@Configuration
public class TextEditorConfig {

	@Bean
	public TextEditor textEditor() {
		return new TextEditor(spellChecker());
	}

	@Bean(initMethod = "init", destroyMethod = "cleanUp")
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}

}
