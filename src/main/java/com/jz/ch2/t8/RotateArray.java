package com.jz.ch2.t8;

public class RotateArray {
    public static  int minNumberInRotateArray(int [] array) {
        //345612
        int right=array.length-1;
        int left = 0;
        int mid;
        while (right>left&&right-left>1){
            mid =(right+left)/2;
           // System.out.println("mid "+mid);

            if(array[left]>array[mid]){//右边数组比较长
                right=mid;
              //  System.out.println("right "+right);
            }
            if (array[left]<=array[mid]){//左边数组比较长
              //  System.out.println("left "+left);
                left=mid;
            }

        }

        return array[right];
    }

    public static void main(String[] args) {
        int[] array = {7,8,9,10,10,2,2,4,4,6};
        System.out.println(minNumberInRotateArray(array));
    }
}
