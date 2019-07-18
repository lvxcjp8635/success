package com.design.prototype.clone;

/**
 * https://blog.csdn.net/qq_40709468/article/details/82316418  说明
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        News news1 ,news2;
        news1 = new News();
        Attach attach = new Attach();
        news1.setAttach(attach);

        news2 = news1.clone();

        System.out.println("new1==news2"+ (news1==news2));
        System.out.println("attach1==attach2"+(news1.getAttach()==news2.getAttach()));
    }

}
