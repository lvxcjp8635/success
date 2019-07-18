package com.design.bridge;

public class Test {
    public static void main(String[] args) {
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        MyBridge bridge = new MyBridge();
        bridge.setSource(source1);
        bridge.method();


        bridge.setSource(source2);
        bridge.method();
    }
}
