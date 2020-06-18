package com.jz.ch2.t2.multiThread;

public class Singleton2 {
    //对整个方法上锁--》对if-else代码块上锁--》仅对创建实例的代码块上锁（有线程安全问题）
    //--》使用双重检查锁机制

    private static Singleton2 singleton;

    public Singleton2() { }

    public static Singleton2 getInstance(){
        try {
            if(singleton!=null){

            }else {
                //模拟创建对象之前的一部分准备工作
                Thread.sleep(3000);
                synchronized(Singleton2.class){
                    if(singleton==null){
                         singleton=new Singleton2();
                    }
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
