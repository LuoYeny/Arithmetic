package enterprise.zj;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/17 15:31
 */
public class TopK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k= sc.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("-------------");
        solution(arr,0,len-1,k);

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void solution(int[] arr,int left,int right,int k){
        if(left>right)
            return;

        int index =partion(arr,left,right);

        if(index==k){
            return  ;
        }else if(index<k){
            solution(arr,index+1,right,k);
        }else{
            solution(arr,left,index-1,k);
        }
    }

    public static int partion(int[] arr,int left,int right ){
        int tmp=arr[left];
        while(left<right){
            while(tmp<arr[right]&&left<right){
                right--;
            }
            arr[left]=arr[right];

            while(tmp>=arr[left]&&left<right){
                left++;
            }
            arr[right]=arr[left];
        }

        arr[left]=tmp;

        return left;
    }

}
