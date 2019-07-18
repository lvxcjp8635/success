package com.design.prototype.deepclone;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        News news1 ,news2;
        news1 = new News();
        Attach attach = new Attach();
        news1.setAttach(attach);

        news2 = news1.deepClone();

        System.out.println("new1==news2"+ (news1==news2));
        System.out.println("attach1==attach2"+(news1.getAttach()==news2.getAttach()));
    }

}
