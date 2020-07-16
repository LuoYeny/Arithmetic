package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 15:12
 */
//给一个无序数组 找到需要排序的最短子数组
public class GetMinLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res = solution(arr);
        System.out.print(res);
    }

    public static int solution(int[] arr){
        if(arr==null||arr.length<2)
            return 0;
        int min=arr[arr.length-1];
        int minIndex=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(min>=arr[i]){
                min=Math.min(arr[i],min);
            }else minIndex=i;
        }

        if(minIndex==-1)
            return 0;
        int max=arr[0];
        int maxIndex=-1;
        for(int i=1;i<arr.length;i++){
            if(max<=arr[i]){
                max=Math.max(arr[i],max);
            }else{
                maxIndex=i;
            }

        }

        return maxIndex-minIndex+1;

    }
}
