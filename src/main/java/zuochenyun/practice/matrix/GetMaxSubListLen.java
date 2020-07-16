package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/10 17:13
 */
//求出未排序正数数组中累加长度为给定值的最长子数组
public class GetMaxSubListLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int len= solution(arr,k);
        System.out.print(len);

    }

    private static int solution(int[] arr , int k){
        int left=0;
        int right=0;
        int sum=arr[0];
        int len=0;

        while(right<arr.length){
            if(sum<k){
                right++;
                if(right==arr.length){
                    break;
                }
                sum=sum+arr[right];
            }else if(sum==k){
                len=Math.max(len,right-left+1);
                sum=sum-arr[left];
                left++;

            } else  {

                sum=sum-arr[left];
                left++;
            }

        }
        return len;
    }
}
