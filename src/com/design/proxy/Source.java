package com.design.proxy;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is method!");
    }
}
