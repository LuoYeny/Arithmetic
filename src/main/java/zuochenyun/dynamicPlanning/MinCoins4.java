package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/26 15:57
 */
public class MinCoins4 {
    public int minCoins(int[] arr,int aim){
        if(arr==null)
            return 0;

        //新建转移矩阵

        int[][]dp=new int[arr.length][aim+1];
        //初始状态
        for (int i = 0; i <arr.length ; i++) {
            dp[i][0]=1;
        }
        for (int i = 1; i <=aim ; i++) {
            if(i-arr[0]>=0&&dp[0][i-arr[0]]>0 ){
                dp[0][i]= 1;
            }

        }
//        //状态转移

//        for (int i = 1; i <arr.length ; i++) {
//            for (int j = 1; j <=aim ; j++) {
//                left=0;
//                 if(j-arr[i]>=0&&dp[i][j-arr[i]]>0){
//                     left+= dp[i-1][j] +dp[i][j-arr[i]];
//                 }
//                 dp[i][j]= left;
//            }
//        }

        for (int i = 1; i <arr.length ; i++) {
            for (int j = 1; j <=aim ; j++) {
                int num=0;
                for (int k = 0;j-arr[i]*k>=0 ; k++) {
                    num+=dp[i-1][j-arr[i]*k];

                }
                dp[i][j]=num;
            }

        }

        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j <dp[0].length ; j++) {
                System.out.print (dp[i][j]+" ");
            }
            System.out.println();
        }

        return  dp[arr.length-1][aim];
    }

    public static void main(String[] args) {
        int[] arr={2,3,6};
        int[] arr1={1,5,10,25};
        System.out.println(new MinCoins4().minCoins(arr,6));
        System.out.println(new MinCoins4().minCoins(arr1,15));
    }
}
