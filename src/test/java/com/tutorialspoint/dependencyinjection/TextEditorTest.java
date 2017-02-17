/**
 * 
 */
package com.tutorialspoint.dependencyinjection;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * @author Drusev
 *
 */
public class TextEditorTest {

	@Mock
	private SpellChecker spellChecker;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testTextEditorWithConstructor() {
		TextEditorWithConstructor textEditor = new TextEditorWithConstructor(spellChecker);
		textEditor.spellCheck();
		verify(spellChecker).checkSpelling();
	}

	@Test
	public void testTextEdiorWithSetter() {
		TextEditorWithSetter textEditor = new TextEditorWithSetter();
		textEditor.setSpellChecker(spellChecker);
		textEditor.spellCheck();
		verify(spellChecker).checkSpelling();
	}

}
