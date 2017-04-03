/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Drusev
 *
 */
public class TextEditorWithSetter {

	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	// wires by type
	@Autowired
	public void setSpellChecker(final SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
