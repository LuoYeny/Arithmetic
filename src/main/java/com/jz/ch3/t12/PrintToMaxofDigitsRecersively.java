package com.jz.ch3.t12;

public class PrintToMaxofDigitsRecersively {
    private static int m=0;
    public static void solution(int n){
        int[] number = new int[n+1];
        //数组初始化
        for (int i = 0; i <=n ; i++) {
            number[i]=0;
        }
        for (int i = 0; i <10 ; i++) {
            number[0]=i;
            printToMaxofDigitsRecersively(number,n,0);
        }
    }


    public static void printToMaxofDigitsRecersively(int[] number,int len,int index){
        //递归终止条件
        System.out.println("进入函数1");
        if(index==len-1){
           // System.out.println("index: "+index+" len: "+len);
          //  print(number);
            return;
        }
        System.out.println("进入循环前2");
        for (int i = 0; i <10 ; i++) {
      //      System.out.println("进入循环3");
            System.out.println("index: "+index+" len: "+len);
            number[index+1]=i;
            printToMaxofDigitsRecersively(number,len,index+1);
            print(number);
       //     System.out.println("递归尾巴4");
        }

    }
    private static  void print(int[] number) {
        m++;
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
    public static void main(String[] args) {
        solution(1  );
        System.out.println("m : "+m);
    }
}
