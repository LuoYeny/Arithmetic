package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 16:43
 */
//最长公共子序列的长度
public class LongestSubList {
    public static void main(String[] args) {
        String s1="ABDHF89hg";
        String s2="ADFujh";
        System.out.println(new LongestSubList().longestSbuList(s1,s2));
    }
    public String longestSbuList(String s1,String s2){
        if(s1==null||s2==null||s1.length()==0||s2.length()==0)
            return null;
        char[] list1=s1.toCharArray();
        char[] list2=s2.toCharArray();
        int m=list1.length-1;
        int n=list2.length-1;
        int[][]dp =getDp(list1,list2);
        char[] res =new char[dp[m][n]];
        System.out.println("dp[m][n]  "+dp[m][n]);
        int index=res.length-1;
        while (index>=0){
            if(n>0&&dp[m][n-1]==dp[m][n]){
                n--;
            }else if(m>0&&dp[m-1][n]==dp[m][n]){
                m--;
            }else {
                res[index--]=list1[m];
                m--;
                n--;
            }
        }

        return String.valueOf(res);


    }


    public int[][] getDp(char[] list1,char[] list2 ){
        int[][] dp=new int[list1.length][list2.length];
        //初始化dp数组
        dp[0][0]=list1[0]==list2[0]?1:0;
        for (int i = 1; i <list1.length ; i++) {
            dp[i][0]=Math.max(dp[i-1][0],list1[i]==list2[0]?1:0);
        }
        for (int i = 1; i <list2.length ; i++) {
            dp[0][i]=Math.max(dp[0][i-1],list1[i]==list2[0]?1:0);
        }

        for (int i = 1; i <list1.length ; i++) {
            for (int j = 1; j <list2.length ; j++) {
                 dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                 if(list1[i]==list2[j]){
                     dp[i][j]=Math.max(dp[i][j],dp[i-1][j-1]+1);
                 }
            }
        }

        return dp;

    }
}
