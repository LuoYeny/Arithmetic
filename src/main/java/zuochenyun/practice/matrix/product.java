package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 15:49
 */
//给定一个数组arr，返回不包含本位置值的累乘数组
public class product {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int p =scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scanner.nextInt();
            }

            solution1(arr,p);

        }

        public static void solution1(int[] arr,int p){
            int count=0;
            long sum=1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    sum=sum*arr[i];
                    sum %= p;
                }else count++;
            }

            long[] res= new long[arr.length];

            for(int i=0;i<arr.length;i++){
                if(count==1){
                    if(res[i]==0){
                        res[i]=sum;
                        res[i] %= p;
                    }else    arr[i]=0;
                }else{
                    res[i]=sum/arr[i];
                    res[i] %= p;

                }
            }
            for(long i:res){
                System.out.print(i+" ");
            }
        }

        public static void solution (int[] arr,int p){


            long[] res = new long[arr.length];
            res[0]=arr[0];
            long tmp=1;

            for(int i=1;i<arr.length;i++){
                res[i]=res[i-1]*arr[i];
                res[i]%=p;
            }
            //  tmp=1;
            for(int i=arr.length-1;i>0;i--){
                res[i]=res[i-1]*tmp;
                res[i]%=p;
                tmp*=arr[i];
                tmp%=p;
            }

            res[0]=tmp;
            for(long i:res){
                System.out.print(i+" ");

            }


        }
    }
