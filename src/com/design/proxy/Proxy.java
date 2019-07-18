package com.design.proxy;

public class Proxy implements Sourceable {
    private Sourceable sourceable;

    public Proxy() {
        super();
        this.sourceable = new Source();
    }

    @Override
    public void method() {
        before();
        sourceable.method();
        after();
    }


    public void before(){
        System.out.println("this is before!");
    }

    public void after(){
        System.out.println("this is after!");
    }
}
