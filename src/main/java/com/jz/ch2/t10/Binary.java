package com.jz.ch2.t10;

public class Binary {

    public static  int numberOf1(int n) {

        int count =0;
        while (n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static  int numberOf2(int n){
        int count =0;
        int flag=1;
        while (flag!=0){
            if((n&flag)!=0){
                count++;
            }
            flag=flag<<1;
        }
          return count;
    }

    public static  int numberOf3(int n) {
        int count = 0;
        while (n !=0) {
              n=n & (n-1);
                count++;

        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(numberOf3(-5));
    }
}
