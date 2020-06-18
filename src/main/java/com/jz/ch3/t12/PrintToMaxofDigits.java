package com.jz.ch3.t12;

public class PrintToMaxofDigits {
    public static void solutuon(int n){
        int[] number = new int[n+1];
        //把字符数组全部填充0
        for (int i = 0; i <=n ; i++) {
            number[i]=0;
        }
        //数字加1
       while (number[n]!=1){
           //数字输出
            print(number);
            number=  increment(number);




        }

    }

    private static  void print(int[] number) {
        int len = number.length-1;
     //   System.out.println("Len : "+len);
        int numLen=0;

        while(len>=0&&number[len]==0){

           len--;

        }
        numLen=len;


        for (int i = numLen; i >=0 ; i--) {
            System.out.print(number[i]);

        }
        System.out.println();

    }

    private static  int[] increment(int[] number) {
        int len = number.length;
         number[0]=number[0]+1;
         int i=0;
        while (number[i]>=10&&i<len-1&&number[len-1]==0){
            number[i]=0;
            number[i+1]=number[i+1]+1;
            i++;
        }

        return number;
    }

    public static void main(String[] args) {
        solutuon(4);
    }
}
