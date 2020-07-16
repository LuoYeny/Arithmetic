package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/8 15:10
 */
//矩阵顺时针打印
public class SpiralOrderPrint {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int row= Integer.parseInt(sc.nextLine());
        int col= Integer.parseInt(sc.nextLine());
        int[][] marix= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                marix[i][j]=Integer.parseInt(sc.nextLine());
            }
        }

        int rows=0;int rowe=row-1;
        int cols=0;int cole=col-1;

        while(rows<=rowe&&cols<=cole){
            solution(marix,rows++,rowe--,cols++,cole--);
        }

    }
    public static void main1(String[] args){


        int[][] marix= {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}, {3,3,3,3}};
        int rows=0;int rowe=marix.length-1;
        int cols=0;int cole=marix[0].length-1;



        while(rows<=rowe&&cols<=cole){
            solution(marix,rows++,rowe--,cols++,cole--);
        }

    }
    public  static void solution( int[][] marix,int rows ,int rowe,int cols,int cole){

        if(rows==rowe){//一行
            while(cols<=cole){
                System.out.print(marix[rows][cols++]+" ");
            }
        }else if(cols==cole){//一列
            while(rows<=rowe){
                System.out.print(marix[rows++][cols]+" ");
            }
        }else{
            int start=cols;
            while(start<=cole){

                System.out.print(marix[rows][start++]+" ");
            }
            start=rows+1;
            while(start<=rowe){
                System.out.print(marix[start++][cole]+" ");
            }
            start=cole-1;
            while(start>=cols){
                System.out.print(marix[rowe][start--]+" ");
            }
            start=rowe-1;
            while(start>rows){
                System.out.print(marix[start--][cols]+" ");
            }

        }


    }
}
