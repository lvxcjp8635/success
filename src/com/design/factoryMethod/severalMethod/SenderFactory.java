package com.design.factoryMethod.severalMethod;

/**
 * 1-2.多个工厂方法模式
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂模式提供了多个工厂方法，分别创建对象。
 */
public class SenderFactory {
    public  Sender getMainSender(){
        return new MailSender();
    }

    public  Sender getSmsSender(){
        return new SmsSender();
    }
}
