package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/26 15:57
 */
public class MinCoins2 {
    public int minCoins(int[] arr,int aim){
        if(arr==null)
            return 0;

        //新建转移矩阵
        int max= Integer.MAX_VALUE;
        int[][]dp=new int[arr.length][aim+1];
        //初始状态
        for (int i = 1; i <=aim ; i++) {
            dp[0][i]=max;
            if(i-arr[0]>=0&&dp[0][i-arr[0]]!=max ){
                dp[0][i]=dp[0][i-arr[0]]+1;
            }

        }
        //状态转移
        int left=0;
        for (int i = 1; i <arr.length ; i++) {
            for (int j = 1; j <=aim ; j++) {
                left=max;
               // dp[i][j]=dp[i-1][j];
                 if(j-arr[i]>=0&&dp[i][j-arr[i]]!=max){
                     left= dp[i][j-arr[i]]+1 ;
                 }
                 dp[i][j]=Math.min(dp[i-1][j],left);
            }
        }

        return dp[arr.length-1][aim]==max?-1:dp[arr.length-1][aim];
    }

    public static void main(String[] args) {
        int[] arr={5,3,2};
        System.out.println(new MinCoins2().minCoins(arr,20));
    }
}
