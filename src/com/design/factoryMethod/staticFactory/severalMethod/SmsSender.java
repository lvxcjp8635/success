package com.design.factoryMethod.staticFactory.severalMethod;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is SmsSender!!");
    }
}
