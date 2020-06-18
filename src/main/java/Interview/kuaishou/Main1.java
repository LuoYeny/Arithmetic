package Interview.kuaishou;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        int y= sc.nextInt();
        int [][] arr = new int[x][y];

        for (int i = 0; i <x ; i++) {
            for (int j = 0; j <y ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        int rel =solution(arr);
        System.out.println(rel);

    }

    private static int solution(int[][] arr) {
        if(arr.length<=2||arr[0].length<=2)
            return 0;
        int x= arr.length;
        int y=arr[0].length;

        int rel=0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <y ; j++) {
                boolean flagx1=false;
                boolean flagx2=false;
                boolean flagy1=false;
                boolean flagy2=false;
                int count=0;

                int n=i;
                int m=j;
//                if(arr[i][j]==1&&i-1>=0&&i+1<x&&j-1>=0&&j+1<y){
//
//                    if(arr[i][j-1]==0
//                            &&arr[i][j+1]==0
//                            &&arr[i+1][j ]==0
//                            &&arr[i-1][j ]==0)
//                        rel++;
//
//                }

                if(arr[i][j]==1){
                    for (int k = m-1; k >=0 ; k--) {
                        if(arr[n][ k]==0)
                            flagx1=true;
                        else count++;
                    }

                    for (int k = m+1; k <y ; k++) {
                        if(arr[n][ k]==0)
                            flagx2=true;
                        else count++;
                    }

                    for (int k = n-1; k >=0 ; k--) {
                        if(arr[k][ m]==0)
                            flagy1=true;
                        else count++;
                    }

                    for (int k = n+1; k <x ; k++) {
                        if(arr[k][ m]==0)
                            flagy2=true;
                        else count++;
                    }

                    System.out.println("i="+i+" j="+j);
                    System.out.println("flagx1 "+flagx1);
                    System.out.println("flagx2 "+flagx2);
                    System.out.println("flagy1 "+flagy1);
                    System.out.println("flagy2 "+flagy2);


                    if (flagx1&&flagx2&&flagy1&&flagy2)
                        rel++;

                }
                System.out.println("count "+count);
            }

        }

return rel;
    }


}
