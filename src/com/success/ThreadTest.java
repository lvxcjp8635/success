package com.success;

public class ThreadTest {

    public static void main(String[] args) {
        new ThreadTest().test();

    }

    public void test(){
        Hero h =new Hero();
        Thread t = new Thread(h);
        Thread t2 = new Thread(h);
        t.start();
        t2.start();
    }



    class Hero implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}
