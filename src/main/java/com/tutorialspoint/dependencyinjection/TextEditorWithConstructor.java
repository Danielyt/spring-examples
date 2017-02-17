/**
 * 
 */
package com.tutorialspoint.dependencyinjection;

/**
 * @author Drusev
 *
 */
public class TextEditorWithConstructor implements TextEditor {

	private final SpellChecker spellChecker;

	public TextEditorWithConstructor(final SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	@Override
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
