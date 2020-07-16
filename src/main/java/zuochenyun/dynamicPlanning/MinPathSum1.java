package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 16:05
 */
//最小路径和--动态规划
public class MinPathSum1 {
    public int minPathSum(int[][] array){
        if(array==null)return 0;
        //构造转移矩阵
        int[][] dp=new int[array.length][array[0].length];
        //初始化转移矩阵

        dp[0][0]=array[0][0];
        for (int i = 1; i <array.length ; i++) {
            dp[i][0]=array[i][0]+dp[i-1][0];
        }
        for (int i = 1; i <array[0].length ; i++) {
            dp[0][i]=array[0][i]+dp[0][i-1];
        }
        //状态转移
        for (int i = 1; i <array.length ; i++) {
            for (int j = 1; j <array[0].length ; j++) {
                dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+array[i][j];
            }
        }

        return dp[array.length-1][array[0].length-1];

    }
}
