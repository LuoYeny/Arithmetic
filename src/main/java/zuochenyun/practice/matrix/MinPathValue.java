package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 18:31
 */
public class MinPathValue {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//
//        int[][] arr = new int[n][m];
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j]=scanner.nextInt();
//            }
//        }
        int[][] arr1 ={{1,0,0},{1,0,0},{1,1,0}};
        int[][] arr2 ={{1,1},{1,1} };

        int res=solution(arr1,0,0,-1,0);
        System.out.print(res);

    }

    public static int solution(int[][]arr,int starti,int startj,int len,int curLen){

        if(arr[starti][startj]!=0){
            curLen=curLen+1;
        }else return len;
        //else return len;


        if(starti==arr.length-1&&startj==arr[0].length-1){
            len=Math.max(curLen,len);
            return len;

        }

        if(starti<arr.length-1){
            if(arr[starti][startj]!=0)
                len= solution(arr,starti+1,startj,len,curLen);

        }
        if(startj<arr[0].length-1){
            if(arr[starti][startj]!=0)
                len= solution(arr,starti,startj+1,len,curLen);

        }

        return len;
    }
}
