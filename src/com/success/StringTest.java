package com.success;

public class StringTest {


    public static void main(String[] args) {
//        testString();
        testStringBuffer();
        testStringBuilder();

    }

    private static void testString() {
        String str = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str+="abc";
        }
        System.out.println(str);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb.append("abc");
        }


        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void testStringBuffer() {
        StringBuffer sb = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb.append("abc");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
