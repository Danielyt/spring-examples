/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import javax.annotation.Resource;

/**
 * @author Drusev
 *
 */
public class TextEditorWithResource {

	private SpellChecker spellChecker;

	// wires by name
	@Resource(name = "spellChecker")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

}
