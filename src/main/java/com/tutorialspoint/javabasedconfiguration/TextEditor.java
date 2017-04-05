/**
 * 
 */
package com.tutorialspoint.javabasedconfiguration;

/**
 * @author Drusev
 *
 */
public class TextEditor {

	private SpellChecker spellChecker;

	public TextEditor(final SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
