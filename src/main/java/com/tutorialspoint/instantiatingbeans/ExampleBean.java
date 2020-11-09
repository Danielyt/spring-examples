package com.tutorialspoint.instantiatingbeans;

public class ExampleBean {
    public ExampleBean() {
        System.out.println("In default constructor of ExampleBean");
    }

    public static class InnerClass {
        public InnerClass() {
            System.out.println("In default constructor of InnerClass");
        }
    }
}
