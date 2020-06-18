package com.jz.ch4.t20;

import java.util.ArrayList;

public class PrintMatrixClockwisely {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {

        if(matrix==null) return null;

        int start =0;
        int columns = matrix[0].length;
        int rows =matrix.length;


        ArrayList<Integer> array = new ArrayList<Integer>();
        while (columns>2*start&&rows>2*start){
           array =PrintMatrixInCircle(matrix,start,columns,rows,array);



            ++start;
        }

            return array;
    }

    private static ArrayList<Integer> PrintMatrixInCircle(int[][] matrix, int start, int columns, int rows,ArrayList arrayList) {
        int endY= rows-1-start;
        int endX= columns-1-start;
        System.out.println("endX  "+endX);
        System.out.println("endY  "+endY);
        System.out.println("s  "+start);


        for (int i = start; i <=endX ; i++) {

            arrayList.add(matrix[start][i]);
            System.out.println("matrix[start][i]  "+matrix[start][i]);
            System.out.print(matrix[start][i]+"  ");
        }
        if(endY>start){
            for (int i = start+1; i <=endY; i++) {
                arrayList.add(matrix[i][endX] );
               System.out.print(matrix[i][endX]+"  ");
            }
        }
        if(endX>start&&endY>start){
            for (int i = endX-1; i >=start ; i--) {
                arrayList.add(matrix[endY][i] );
               System.out.print(matrix[endY][i]+"  ");
            }
        }
        if(endY-start>1&&start<endX){
            for (int i = endY-1; i >start+1 ; i--) {
                arrayList.add(matrix[i][start]);
                System.out.print(matrix[i][start]+"  ");
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] [] a={{1},{2},{3},{4},{5}};
        printMatrix(a);
    }
}
