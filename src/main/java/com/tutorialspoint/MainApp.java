package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Drusev
 *
 */
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("Beans.xml");

      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

      obj.getMessage();
      obj.setMessage("new message");
      
      HelloWorld obj2 = (HelloWorld) context.getBean("singletonHelloWorld");
      obj2.getMessage();
      obj2.setMessage("obj2 message");
      
      HelloWorld obj3 = (HelloWorld) context.getBean("singletonHelloWorld");
      obj3.getMessage();
   }
}