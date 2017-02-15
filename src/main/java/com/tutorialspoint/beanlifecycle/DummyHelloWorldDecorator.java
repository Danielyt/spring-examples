/**
 * 
 */
package com.tutorialspoint.beanlifecycle;

/**
 * Dummy decorator of HelloWorld for testing.
 * 
 * @author Drusev
 *
 */
public class DummyHelloWorldDecorator extends HelloWorld {

	private final HelloWorld decoratedObject;

	public DummyHelloWorldDecorator(final HelloWorld decoratedObject) {
		this.decoratedObject = decoratedObject;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside dummy decorator afterPropertiesSet");
		decoratedObject.afterPropertiesSet();
	}

	@Override
	public void init() {
		System.out.println("inside dummy decorator init");
		decoratedObject.init();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("inside dummmy decorator destroy");
		decoratedObject.destroy();
	}

	@Override
	public void xmlDefinedDestroy() {
		System.out.println("inside dummy decorator xmlDefinedDestroy");
		decoratedObject.xmlDefinedDestroy();
	}

	@Override
	public void setMessage(final String message) {
		decoratedObject.setMessage(message);
	}

	@Override
	public void getMessage() {
		decoratedObject.getMessage();
	}
}
