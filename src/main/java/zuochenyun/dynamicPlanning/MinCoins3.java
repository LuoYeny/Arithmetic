package zuochenyun.dynamicPlanning;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 16:51
 */
//换钱的方法有多少种--回溯

    //有重复问题
    //目前想到的解决办法---set去重
public class MinCoins3 {
    public int minCoins(int[] arr,int aim){
        if(arr==null||aim==0)
            return 0;

        int res= solution(arr,0,aim);
        return res;
    }

    private int solution(int[] arr, int index,int aim ) {
        int res=0;
        if(index==arr.length){
            res=aim==0?1:0;
        }else {
            for (int i = 0; arr[index]*i<=aim ; i++) {
               res+= solution(arr,index+1,aim-arr[index]*i);

            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr={2,3};
        int[] arr1={5,10,25,1};
        System.out.println(new MinCoins3().minCoins(arr1,15));
    }
}
