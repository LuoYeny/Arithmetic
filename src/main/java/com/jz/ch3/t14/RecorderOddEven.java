package com.jz.ch3.t14;

public class RecorderOddEven {
    public void reOrderArray(int [] array) {

        int tail = array.length-1;
        int i=0;
        int tmp =0;
        while (i<array.length&&i<tail){
            if(array[i]%2==0){

                tmp=array[tail];
                array[tail]=array[i];
                 array[i]=tmp;
                 tail--;


            }else i++;
        }
        for (int j = 0; j <array.length ; j++) {
            System.out.println(array[j]);
        }

    }
    public void exchange(int a,int b){
        int tmp=0;
        tmp=a;
        a=b;
        b=tmp;
       // System.out.println("a "+a+" b "+b);
    }

    public static void main(String[] args) {
       int[] array = new int[]{1,32,2,5,6,4,7,60};
       RecorderOddEven recorderOddEven = new RecorderOddEven();
       recorderOddEven.reOrderArray(array);
    }
}
