package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/2 16:49
 */
public class MaxSum {
    public int  maxSun(int[] arr){
        if(arr==null||arr.length==0)
            return 0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            max=Math.max(max,sum);
            sum=sum>0?sum:0;

        }
        return max;

    }
}
