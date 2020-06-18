package com.jz.ch2.t2.singleThread;

public class Singleton0Thread extends Thread{
    @Override
    public void run() {
        System.out.println(Singleton0.getInstance().hashCode());
    }
}
