package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/12 17:27
 */
//给定一个长度为N的整形数组arr，其中有N个互不相等的自然数1-N。请实现arr的排序，
public class Sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();

        }

        solution(arr  );
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }

    }

    public static void solution(int[] arr){
        int tmp=0;
        int next=0;
        for(int i=0;i<arr.length;i++){
            tmp=arr[i];
            while(arr[i]!=i+1){
                next=arr[tmp-1];
                arr[tmp-1]=tmp;
                tmp=next;

            }

        }
    }
    public static void solution2(int[] arr){
        int tmp=0;

        for(int i=0;i<arr.length;i++){

            while(arr[i]!=i+1){
                tmp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=tmp;
            }

        }
    }
}
