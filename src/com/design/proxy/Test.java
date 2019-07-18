package com.design.proxy;

public class Test {
    public static void main(String[] args) {
        Sourceable proxy = new Proxy();
        proxy.method();
    }
}
