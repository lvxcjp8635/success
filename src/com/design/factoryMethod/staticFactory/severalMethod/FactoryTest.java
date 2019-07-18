package com.design.factoryMethod.staticFactory.severalMethod;

public class FactoryTest {
    public static void main(String[] args) {
        Sender smsSender = new SenderFactory().getSmsSender();
        Sender mailSender = new SenderFactory().getMainSender();
        smsSender.send();
        mailSender.send();
    }
}
