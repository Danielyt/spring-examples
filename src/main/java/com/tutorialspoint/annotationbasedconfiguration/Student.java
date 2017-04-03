/**
 * 
 */
package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author Drusev
 *
 */
public class Student {

	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	@Required
	public void setAge(final Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(final String name) {
		this.name = name;
	}

}
