package com.jz.ch2.t3;

public class TwoDimensionalOrderedArray {
    public static boolean find(int[][] array,int target){

        for (int i = 0; i < array.length; i++) {    //行
            for (int j = 0; j < array[i].length; j++) {   //列
                System.out.println("arry["+i+"]["+j+"]  :"+array[i][j]);
               if(target<=array[i][j]){
                //   System.out.println("arry["+i+"]["+j+"-1]  :"+array[i][j-1]);
                   if(target==array[i][j]){
                       return true;
                   }else break;

               }//else break;
            }

        }

        return false;
    }

    public static boolean find2(int[][] array,int target){
        int row=array.length;
        int col=array[0].length;
        int i=0;int j=col-1;
        while (i<row&&j>=0){
            if(target>array[i][j]){
                i++;
            }else if(target<array[i][j]){
                j--;
            }else return true;
        }
        return false;
    }









    public static void main(String[] args) {
        int[][] arry = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int[][]arry1={{}};
       boolean result= find2(arry ,5);
        System.out.println(result);
    }
}
