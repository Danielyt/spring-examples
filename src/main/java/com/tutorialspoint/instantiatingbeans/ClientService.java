package com.tutorialspoint.instantiatingbeans;

public class ClientService {

    private ClientService() {
        super();
    }

    private static class InstanceHolder {
        private static final ClientService INSTANCE = new ClientService();
    }

    public static ClientService getInstance() {
        System.out.println("Getting instance of singleton ClientService");
        return InstanceHolder.INSTANCE;
    }
}
