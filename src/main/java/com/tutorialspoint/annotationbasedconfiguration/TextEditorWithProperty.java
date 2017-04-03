/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Drusev
 *
 */
public class TextEditorWithProperty {

	// wires by type
	@Autowired
	private SpellChecker spellChecker;

	public TextEditorWithProperty() {
		System.out.println("Inside TextEditorWithProperty constructor.");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
