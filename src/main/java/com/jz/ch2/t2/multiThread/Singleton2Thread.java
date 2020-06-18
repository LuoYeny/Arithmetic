package com.jz.ch2.t2.multiThread;

public class Singleton2Thread extends Thread{
    @Override
    public void run() {
        System.out.println(Singleton2.getInstance().hashCode());
    }
}
