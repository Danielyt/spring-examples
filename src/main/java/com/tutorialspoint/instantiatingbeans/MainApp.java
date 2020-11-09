package com.tutorialspoint.instantiatingbeans;

import com.sun.security.ntlm.Client;
import com.tutorialspoint.beandefinitioninheritance.HelloIndia;
import com.tutorialspoint.beandefinitioninheritance.HelloWorld;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("InstantiatingBeans.xml")) {

            ExampleBean example = (ExampleBean) context.getBean("exampleBean");

            ExampleBean.InnerClass example2 = (ExampleBean.InnerClass) context.getBean("innerClass");

            ClientService example3 = (ClientService) context.getBean("clientService");

            AccountService example4 = (AccountService) context.getBean("accountService");
        }
    }
}
