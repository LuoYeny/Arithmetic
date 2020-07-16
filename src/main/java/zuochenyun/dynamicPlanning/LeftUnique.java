package zuochenyun.dynamicPlanning;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 16:55
 */
public class LeftUnique {

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
            int end=0;
            int start=1;

            while(start<arr.length){
                if(arr[end]!=arr[start]){
                    swap(arr,++end,start++);
                }else{
                    start++;
                }

            }

        }

        public static void swap(int[] arr,int i ,int j){
            int tmp =arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }


    }

