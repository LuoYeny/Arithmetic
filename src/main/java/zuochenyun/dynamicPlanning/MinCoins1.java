package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 16:51
 */
//换钱的最少货币数--回溯
public class MinCoins1 {
    public int minCoins(int[] arr,int aim){
        if(arr==null||aim==0)
            return 0;

        int res= solution(arr,aim,arr.length,Integer.MAX_VALUE,0,0);
        return res;
    }

    private int solution(int[] arr, int aim, int length, int num,int curNum, int curSum) {
     //   System.out.println("curSum  "+curSum+"   curNum  "+curNum);
      //  System.out.println();
        if(curSum==aim){

            num=Math.min(num,curNum);
            return num;
        }

        if(curSum>aim)
            return num;

        for (int i = 0; i <length ; i++) {
            curSum=curSum+arr[i];
            num=solution(arr,aim,length,num,curNum+1,curSum);
            curSum=curSum-arr[i];
        }

        return num;
    }

    public static void main(String[] args) {
        int[] arr={5,3,2};
        System.out.println(new MinCoins1().minCoins(arr,20));
    }
}
