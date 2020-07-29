package zuochenyun.string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/2 17:16
 */
//Palindrom  回文
//添加最少字符串使整个字符串变成整体回文
public class GetPalindrom {

    public String getPalindrom(String str){
        if(str==null||str.length()==0){
            return null;
        }
        char[] chars =str.toCharArray();
        int[][]dp= getDp(chars);
        char[] res=new char [dp[0][dp[0].length-1]+chars.length];
        int i=0;
        int j=chars.length-1;
        int resl=0;
        int resr=res.length-1;

        while (i<=j){
            if(chars[i]==chars[j]){
                res[resl++]=chars[i];
                res[resr--]=chars[i];
                i++;
                j--;
            }else {
                if(dp[i+1][j]<dp[i][j-1]){
                    res[resr--]=chars[i];
                    res[resl++]=chars[i++];
                }else {
                    res[resr--]=chars[j];
                    res[resl++]=chars[j--];
                }

            }


        }


        return String.valueOf(res);
    }

    public int[][] getDp(char[] chars){
        int[][] dp=new int[chars.length][chars.length];

           //i控制首部 j控制尾部
        for (int j = 1; j <chars.length ; j++) {
            dp[j-1][j]=chars[j]==chars[j-1]?0:1;//判断字符与前一个是否相等  最先判断前两个0,1
            for (int i = j-2; i >=0 ; i--) {//从两头开始  判断 j 与 j-1之前的数是否相等
              if(chars[i]==chars[j]){
                  dp[i][j]=dp[i+1][j-1];  //首部+1 尾部-1
              }else {
                  dp[i][j]=Math.min(dp[i+1][j],dp[i][j-1])+1;//看看让i--j-1,或者 i+1--j变成回文谁的代价比较小
              }
            }

        }

        for (int i = 0; i <dp[0].length ; i++) {
            for (int j = 0; j <dp.length ; j++) {
                System.out.print (dp[i][j]+" ");;
            }
            System.out.println();
        }
        return dp;
    }


    public static void main(String[] args) {

        System.out.println(new GetPalindrom().getPalindrom("aaac"));
    }
}
