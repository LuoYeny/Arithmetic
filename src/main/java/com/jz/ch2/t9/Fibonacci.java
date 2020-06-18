package com.jz.ch2.t9;

public class Fibonacci {
    //递归解法
    //由太多重复计算的项 效率太低
    public int fibonacci(int n) {
       if(n<=0) return 0;
       if(n==1) return 1;

        return fibonacci(n-1)+fibonacci(n-2);
    }


    public int fiboacci(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        int f0=0;
        int f1=1;
        int fn=0;
         //n可以为2
        for (int i = 2; i <=n ; i++) {
            fn=f0+f1;
            f0=f1;
            f1=fn;
        }

        return fn;
    }
}
