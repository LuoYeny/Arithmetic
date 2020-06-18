package com.jz.binaryTree;

public class Solution {
    public static int[][] map(int m,int n, int[][] arry){
        int[][]relArry= new int[m][n];
        if(arry.length!=m)
            return null;
        if(m==0||n==0)
            return null;

        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(arry[i][j]==0){
                    relArry[i][j]=0;
                    break;
                }

               else relArry[i][j]=1;

            }

        }
        return relArry;

    }
}
