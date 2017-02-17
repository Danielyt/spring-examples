/**
 * 
 */
package com.tutorialspoint.dependencyinjection;

/**
 * @author Drusev
 *
 */
public class TextEditorWithSetter implements TextEditor {

	private SpellChecker spellChecker;

	// a setter method to inject the dependency.
	public void setSpellChecker(final SpellChecker spellChecker) {
		System.out.println("Inside setSpellChecker.");
		this.spellChecker = spellChecker;
	}

	// a getter method to return spellChecker
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Override
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
