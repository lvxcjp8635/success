package com.design.singleton;

/**
 *内部类来维护单例的实现
 *
 *
 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。
 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。
 ▲这样我们暂时总结一个完美的单例模式：
 其实说它完美，也不一定，如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。
 所以说，十分完美的东西是没有的，我们只能根据实际情况，选择最适合自己应用场景的实现方法。
 */
public class Singleton {

    private Singleton singleton = null;
    /**
     * 私有构造方法，防止被创建
     */
    private Singleton(){
    }

    private static class SingletonFactory{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonFactory.singleton;
    }


}
