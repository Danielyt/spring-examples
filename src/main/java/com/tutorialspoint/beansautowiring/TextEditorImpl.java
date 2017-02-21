/**
 * 
 */
package com.tutorialspoint.beansautowiring;

import com.tutorialspoint.dependencyinjection.SpellChecker;
import com.tutorialspoint.dependencyinjection.TextEditor;

/**
 * @author Drusev
 *
 */
public class TextEditorImpl implements TextEditor {

	private SpellChecker checker;
	private String name;

	public void setChecker(final SpellChecker checker) {
		this.checker = checker;
	}

	public SpellChecker getChecker() {
		return checker;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void spellCheck() {
		checker.checkSpelling();
	}

}
