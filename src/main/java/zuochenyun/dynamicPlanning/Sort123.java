package zuochenyun.dynamicPlanning;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 17:13
 */
public class Sort123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }

        solution(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }


    public static void solution(int[] arr){
        int left=0;
        int right =arr.length-1;
        int index=0;

        while(index<=right){
            if(arr[index]==1){
                index++;
            }else if(arr[index]==2){
                swap(arr,index,right--);
            }else{
                swap(arr,index++,left++);  //左边换过来的是1
            }
        }

    }

    public static void swap(int[] arr,int i ,int j){
        int tmp =arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
