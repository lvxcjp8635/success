package com.design.factoryMethod.normal;

/**
 * 1-1.普通工厂模式
 * 就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 */
public class SenderFactory {
    public   Sender getSender(String type){
        if(type.equals("mail")){
            return new MailSender();
        }else if(type.equals("sms")){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型！！");
            return null;
        }
    }
}
