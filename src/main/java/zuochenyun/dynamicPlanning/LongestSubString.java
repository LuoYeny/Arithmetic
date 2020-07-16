package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 17:00
 */
public class LongestSubString {
    public static void main(String[] args) {
      //  new LongestSubString().lcst("1234wqwe","1232434wfff");
        System.out.println(new LongestSubString().lcst("1234wqwe","1232434wqwf"));
    }

    public String lcst(String str1,String str2){
        if(str1==null||str2==null||str1.length()==0||str2.length()==0)
            return null;

        char[] chars1= str1.toCharArray();
        char[]chars2=str2.toCharArray();

        int[][] dp= getDp(chars1,chars2);
         int end=0;
         int max=0;
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                if(dp[i][j]>max){
                    max=dp[i][j];
                    end=i;
                }

            }
        }

        return str1.substring(end-max+1,end+1);

    }
    public int[][] getDp(char[] chars1,char[]chars2){


        int[][]dp= new int[chars1.length][chars2.length];
        //初始化矩阵  第一行
        for (int i = 0; i <chars1.length ; i++) {
            if(chars2[0]==chars1[i]){
                dp[0][i]=1;
            }
        }
        //初始化矩阵  第一列
        for (int i = 0; i <chars2.length ; i++) {
            if(chars1[0]==chars2[i]){
                dp[i][0]=1;
            }
        }

        for (int i = 1; i <chars1.length ; i++) {
            for (int j = 1; j <chars2.length ; j++) {
                if(chars1[i]==chars2[j])
                    dp[i][j]=dp[i-1][j-1]+1;
            }
        }

        return dp;

    }
}
