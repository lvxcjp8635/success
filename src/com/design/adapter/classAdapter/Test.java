package com.design.adapter.classAdapter;

public class Test {
    public static void main(String[] args) {
        Targetable target =new Adapter();
        target.method1();
        target.method2();
    }
}
