package org.javatrain.is;

public class Worker extends Thread{
    private SharedResource sharedResource;

    public Worker(SharedResource sharedResource, String name) {
        super(name);
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.accessResource(getName());
    }
}
