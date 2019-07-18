package com.design.factoryMethod.normal;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is MainSender!!");
    }
}
