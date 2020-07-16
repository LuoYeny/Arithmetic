package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/10 15:47
 */
//有序数组中不重复打印相加和为给定值的二元组
public class PrintUniquePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solution(arr,k);

    }

    private static void solution(int[] arr , int k){
        int left=0;
        int right=arr.length-1;

        while(left<right){

            if((arr[left]+arr[right])==k){
                if(left==0||arr[left-1]!=arr[left])  //去重
                    System.out.println(arr[left]+" "+arr[right]);
                left++;
                right--;
            }else if((arr[left]+arr[right])>k){
                right--;
            }else{
                left++;
            }
        }
    }
}
