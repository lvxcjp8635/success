package com.design.factoryMethod.normal;

public class FactoryTest {
    public static void main(String[] args) {
        Sender smsSender = new SenderFactory().getSender("sms");
        Sender mailSender = new SenderFactory().getSender("mail");
        smsSender.send();
        mailSender.send();
    }
}
