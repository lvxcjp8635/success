package com.design.abstractFactory;

public class MailSenderFactory implements SenderFactory {
    @Override
    public Sender getSender() {
        return new MailSender();
    }
}
