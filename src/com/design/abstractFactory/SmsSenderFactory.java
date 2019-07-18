package com.design.abstractFactory;

public class SmsSenderFactory implements SenderFactory {
    @Override
    public Sender getSender() {
        return new SmsSender();
    }
}
