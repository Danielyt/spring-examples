package com.tutorialspoint.dependencyinjection;

/**
 * @author Drusev
 *
 */
public class SpellCheckerImpl implements SpellChecker {

	public SpellCheckerImpl() {
		System.out.println("Inside SpellCheckerImpl constructor.");
	}

	@Override
	public void checkSpelling() {
		System.out.println("Inside checkSpelling.");
	}
}
