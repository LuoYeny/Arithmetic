package zuochenyun.practice.matrix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/12 16:47
 */
//求出未排序(正数,负数都有)数组中累加长度为给定值的最长子数组
public class GetMaxSubListLen2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();

        }

        int res=  solution(arr ,k );
        System.out.print(res);
    }

    public static int solution(int[] arr,int k){

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);// 0的前一个
        int sum=0;
        int len=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(!map.containsKey(sum))
                map.put(sum,i);
            if(map.containsKey(sum-k)){
                len=Math.max(len,i-map.get(sum-k) );
            }


        }

        return len;
    }
}
