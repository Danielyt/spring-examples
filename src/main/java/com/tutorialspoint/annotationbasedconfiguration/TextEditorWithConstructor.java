/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Drusev
 *
 */
public class TextEditorWithConstructor {

	private SpellChecker spellChecker;

	// wires by type
	@Autowired
	public TextEditorWithConstructor(final SpellChecker spellChecker) {
		System.out.println("Inside TextEditorWithConstructor constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
