package com.jz.ch2.t2.innerClass;

public class Singleton3 {
    private static  class Singleton{
        private static Singleton3 singleton= new Singleton3();
    }

    private Singleton3() { }
    public static  Singleton3 getInstance(){
        return Singleton.singleton;
    }

}
