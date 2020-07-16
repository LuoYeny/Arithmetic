package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 16:42
 */
//矩阵的最大累加子矩阵
public class MaxSumForMartix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int [][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int res=  solution(arr);
        System.out.print(res);
    }

    public static int solution(int [][] arr){
        int maxSum=Integer.MIN_VALUE;
        int row =arr.length;
        int col = arr[0].length;
        int cur=0;
        int[] s= null;
        for(int i=0;i<row;i++){
            s=new int[col];
            for(int j=i;j<row;j++){
                cur=0;
                for(int k=0;k<col;k++){
                    s[k]+=arr[j][k];
                    cur+=s[k];
                    maxSum=Math.max(maxSum,cur);
                    cur=cur<0?0:cur;
                }
            }
        }
        return maxSum;
    }
}
