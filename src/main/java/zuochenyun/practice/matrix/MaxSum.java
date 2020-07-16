package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 16:41
 */
//子数组的最大累加和
public class MaxSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=  solution(arr);

        System.out.print(res);

    }

    public static int solution(int [] arr){
        int cur=0;
        int maxSum= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cur=cur+arr[i];
            if(cur>0){
                maxSum=Math.max(cur,maxSum);
            }else{
                cur=0;
            }
        }

        return maxSum;
    }
}
