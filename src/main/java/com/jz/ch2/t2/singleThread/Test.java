package com.jz.ch2.t2.singleThread;

public class Test {

    public static void main(String[] args) {
        Singleton0Thread t1 = new Singleton0Thread();
        Singleton0Thread t2 = new Singleton0Thread();
        Singleton0Thread t3 = new Singleton0Thread();
        t1.start();
        t2.start();
        t3.start();
    }


}
