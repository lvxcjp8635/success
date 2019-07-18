package com.design.factoryMethod.severalMethod;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MainSender!!");
    }
}
