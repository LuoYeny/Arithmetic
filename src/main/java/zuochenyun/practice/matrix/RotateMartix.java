package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/8 16:21
 */
public class RotateMartix {

        public static void main(String[] args){
            int n=3;
            int[][] matrix =  {{1,2,3},{4,5,6},{7,8,9}};
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
//            int start=0;
//            int end =n-1;
//            while(start<=end){
//                solution1(matrix,start++,end--);
//            }
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    System.out.print(matrix[i][j]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
            solution2(matrix);
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }

    private static void solution1(int[][] matrix, int start, int end) {
            int rows=start;
            int rowe=end;
            int cols=start;
            int cole=end;
            int i=0;
            while (i<(end-start)){
                int tmp=matrix[rows][cols+i];
                matrix[rows][cols+i]=matrix[rowe-i][cols];
                matrix[rowe-i][cols]=matrix[rowe][cole-i];
                matrix[rowe][cole-i]=matrix[rows+i][cole ];
                matrix[rows+i][cole ]=tmp;
                i++;

            }
    }
    public static void solution(int[][] matrix,int start,int end){
        int rows=start;
        int rowe=end;
        int cols=start;
        int cole=end;
        int i=0;
        while(i<(end-start)){
            int tmp=matrix[rows][cols+i];
            matrix[rows][cols+i]=matrix[rowe-i][cols];
            matrix[rowe-i][cols]=matrix[rowe][cole-i];
            matrix[rowe][cole-i]=matrix[rows+i][cole];
            matrix[rows+i][cole]=tmp;

            i++;
        }

    }
    private static void solution2(int[][] matrix ) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = i+1; j <matrix[0].length ; j++) {
                swap(matrix,i,j);
            }
        }
        for (int i = matrix.length-1; i >0 ; i--) {
            for (int j = matrix[0].length-i; j <matrix[0].length ; j++) {
                swap2(matrix,i,j);
            }
        }
    }

    private static void swap(int[][] matrix, int i, int j) {
            int tmp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=tmp;
    }
    private static void swap2(int[][] matrix, int i, int j) {
            int n=matrix.length-1;
        int tmp=matrix[i][j];
        matrix[i][j]=matrix[n-j][n-i];
        matrix[n-j][n-i]=tmp;
    }



}
