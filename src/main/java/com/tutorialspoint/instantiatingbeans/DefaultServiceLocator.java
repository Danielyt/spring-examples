package com.tutorialspoint.instantiatingbeans;

public class DefaultServiceLocator {

    public DefaultServiceLocator() {
        System.out.println("Instantiating DefaultServiceLocator");
    }

    public AccountService getAccountService() {
        System.out.println("Getting a new instance of AccountService");
        return new AccountService();
    }
}
