package Interview.practice;

import java.util.Scanner;

public class RotationMatrix {

    public static int[] solution(int line,int row,int[][]array){


        int[] rel =new int[line*row];
        int rowStart =0;
        int rowEnd=row -1;
        int lineStart = 0;
        int lineEnd=line -1;
        int i=0;
        System.out.println("row "+row);
        System.out.println("line "+line);
        if(row==1||line==1){
            for (int j = 0; j <row ; j++) {
                for (int k = 0; k <line ; k++) {
                    System.out.println("j "+j);
                    System.out.println("k "+k);
                    rel[i++]=array[j][k];
                }
            }
        }
        for (int j = 0; j < row; j++) {
            for (int k = 0; k <line ; k++) {
                System.out.print (array[j][k]+" ");
            }
            System.out.println( );
        }

        while (rowStart+rowEnd<row&&lineStart+lineEnd<line
                &&rowEnd>0&&lineEnd>0){

            for (int j = rowStart; j <=rowEnd ; j++) {
                rel[i++]=array[j][lineStart];

            }
            lineStart++;
            for (int j = lineStart; j <=lineEnd ; j++) {
                rel[i++]=array[rowEnd][j];
            }
           rowEnd--;
            for (int j = rowEnd; j >=rowStart ; j--) {
                rel[i++]=array[j][lineEnd];
            }

            lineEnd--;
            for (int j = lineEnd; j >=lineStart ; j--) {
                rel[i++]=array[rowStart][j];
            }
            rowStart++;
        }


        return rel;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int line=sc.nextInt();
        int row =sc.nextInt();

        if(row==0||line==0)
            return;
        int[][] array= new int[row][line];

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <line ; j++) {
               array[i][j]= sc.nextInt();
            }
        }

     //   int [][] array1={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};


        int[] rel= solution(line,row,array);

        for (int i = 0; i <rel.length ; i++) {
            System.out.print (rel[i]+"  ");
        }

    }
}
