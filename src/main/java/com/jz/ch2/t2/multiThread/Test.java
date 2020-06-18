package com.jz.ch2.t2.multiThread;

public class Test {

    public static void main(String[] args) {
        Singleton2Thread t1 = new Singleton2Thread();
        Singleton2Thread t2 = new Singleton2Thread();
        Singleton2Thread t3 = new Singleton2Thread();
        t1.start();
        t2.start();
        t3.start();
    }


}
