package zuochenyun.practice.matrix;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/10 15:47
 */
//有序数组中不重复打印相加和为给定值的三元组
public class PrintUniqueTried {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
  int [] arr ={-8 ,-4 ,-3,0 ,1 ,2, 4, 5 ,8 ,9};
      //  int [] arr ={1,2,3,4,8,9};

        int k=10;
        for(int i=0;i<arr.length-2;i++){
            if(i==0||arr[i]!=arr[i-1]){

             //   System.out.println("k-arr[i] "+ (k-arr[i]) );
             //   k=k-arr[i];
             //   System.out.println(" k "+ ( k) );

                solution(arr,k-arr[i],i+1,i);
            }

        }


    }

    private static void solution(int[] arr , int k,int left,int base){

        int right=arr.length-1;

        while(left<right){
        System.out.println(" left "+left+" right "+right+" base "+base);
           System.out.println(" arr[left] "+arr[left]+" arr[right] "+arr[right]+" arr[base] "+arr[base]+"  k "+k );
            if((arr[left]+arr[right])==k){
                if(left==base+1||arr[left-1]!=arr[left])
                    System.out.println(arr[base]+" "+arr[left]+" "+arr[right]);
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
