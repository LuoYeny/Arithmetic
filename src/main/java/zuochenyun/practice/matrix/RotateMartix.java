package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/8 16:21
 */
public class RotateMartix {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int[][] matrix = new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            int start=0;
            int end =n-1;
            while(start<=end){
                solution(matrix,start++,end--);
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
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
}
