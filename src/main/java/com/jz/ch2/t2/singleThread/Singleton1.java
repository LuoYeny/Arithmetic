package com.jz.ch2.t2.singleThread;
//延迟加载  懒汉模式
//该例程只在单线程下可行  （错误的单例模式）
public class Singleton1 {
    private static Singleton1 singleton;


    private Singleton1(){}
    private static Singleton1 getInstance() {
        //延迟加载
        try {
            if(singleton!=null){

            }else {
                Thread.sleep(3000);
                singleton=new Singleton1();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }

}
