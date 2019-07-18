package com.design.decorator;

public class Decorator implements Sourceable{
    private Sourceable source;
    public Decorator(Sourceable source) {
        this.source = source;
    }

    public void before(){
        System.out.println("this is before!");
    }

    public void after(){
        System.out.println("this is after!");
    }

    /**
     * 注意这里也要实现method方法
     */
    @Override
    public void method() {
        before();
        source.method();
        after();
    }
}
