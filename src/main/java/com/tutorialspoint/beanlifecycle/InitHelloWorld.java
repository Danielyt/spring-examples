/**
 * 
 */
package com.tutorialspoint.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Drusev
 *
 */
public class InitHelloWorld implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {
		System.out.println("BeforeInitialization : " + beanName);
		if (bean instanceof HelloWorld) {
			return new DummyHelloWorldDecorator((HelloWorld) bean);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
		System.out.println("AfterInitialization : " + beanName + bean.getClass());
		return bean;
	}
}
