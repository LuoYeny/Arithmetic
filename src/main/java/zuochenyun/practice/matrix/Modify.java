package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 15:00
 */
//奇数下表为奇数 偶数下标为偶数
public class Modify {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        solution(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void solution(int [] arr){
        int end = arr.length-1;
        int even=0;
        int odd=1;
        while(even<=end&&odd<=end){
            if((arr[end]&1)==1){//奇数
                swap(arr,odd,end);
                odd=odd+2;
            }else  {
                swap(arr,even,end);
                even=even+2;
            }

        }
    }
    public static void swap(int [] arr,int i,int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
