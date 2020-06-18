package com.jz.ch2.t2.singleThread;
//饿汉模式
//立即加载 使用类的时候已经将对象创建完毕
//推荐指数 ****
//在一个实例的情况下不会出现线程安全问题
//但是第一个实例不是在第一次调用getInstance()时创建 而是在使用该类时创建
public class Singleton0 {

    private static Singleton0 singleton = new Singleton0();

    private Singleton0(){};

    public static  Singleton0 getInstance(){
        return  singleton;
    }
}
