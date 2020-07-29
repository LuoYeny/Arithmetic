package zuochenyun.dynamicPlanning;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/29 16:56
 */
//最长递增子序列
public class GenerateLIS1 {
    public int[] getSubList(int[] arr){
        if(arr==null||arr.length==0)
            return null;
        int[] dp =getDp1(arr);
        int[] dp2=getdp(arr);

        for (int i = 0; i <dp.length ; i++) {
            System.out.print(dp[i]+" ");
        }
        System.out.println();
        for (int i = 0; i <dp2.length ; i++) {
            System.out.print(dp2[i]+" ");
        }
        return generatLIS(arr,dp);



    }


    //求转移数组
    public int[] getDp1(int[] arr){
        int[] dp=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            dp[i]=1;
            for (int j = 0; j <i ; j++) {
                if(arr[i]>arr[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp;

    }

    //根据生成的dp[]反推最长子数组
    public int[] generatLIS(int[] arr,int[] dp){
        //求dp中的最大值，以及坐标
        int len =0;
        int index=0;

        for (int i = 0; i <dp.length ; i++) {
            if(dp[i]>=len){
                len=dp[i];
                index=i;
            }

        }

        int[] list = new int[len];
        list[--len]=arr[index];


        for (int j = index; j >=0 ; j--) {
            if(arr[j]<arr[index]&&dp[j]==dp[index]-1){
                list[--len]=arr[j];
                index=j;

            }
        }

        return list;

    }
    public   int[] getdp(int[] arr){
        int[] dp = new int[arr.length];
        int[] ends = new int[arr.length];
        ends[0] = arr[0];
        dp[0] = 1;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        for(int i=1;i<arr.length;i++){
            l=0;
            r=right;
            while(l<=r){
                m = (l+r)/2;
                if(arr[i]>ends[m]){
                    l = m+1;
                }else{
                    r = m-1;
                }
            }
            right = Math.max(right,l);
            ends[l] = arr[i];
            dp[i] = l+1;
        }
        return dp;
    }

    public static void main(String[] args) {
        int[] arr= {2,1,5,3,6,4,8,9,7};
        int[] arr1= {2,1,5,3,6,4,8,9,7};
        int[] arr2= {3,2,4,7,5,9,8};
        int[] res=new GenerateLIS1().getSubList(arr2);

        for (int i = 0; i <res.length ; i++) {
            System.out.print (res[i]+"  ");
        }







    }
}
