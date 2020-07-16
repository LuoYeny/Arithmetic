package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/10 15:29
 */
//最长可整合的子数组长度
public class GetLIL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res = solution(arr);
        System.out.print(res);
    }

    public static int solution(int[] arr){

        int len=0;
        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];

                }
                if(arr[j]<min){
                    min=arr[j];
                }

                if(max-min==j-i){
                    len=Math.max(len,j-i+1);
                }
            }
        }



        return len;
    }
}

