/**
 * 
 */
package com.tutorialspoint.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Drusev
 *
 */
@Configuration
public class HelloWorldConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}

}
