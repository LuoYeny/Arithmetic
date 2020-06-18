package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/3 15:32
 */
public class MaxProduct {
    public double maxProduct(double[] arr){
        if(arr==null||arr.length==0)
            return 0;
        double max=arr[0];
        double min=arr[0];
        double maxEnd=0;
        double minEnd=0;
        double res=0;
        for (int i =1 ; i <arr.length ; i++) {
            maxEnd =arr[i]*max;
            minEnd =arr[i]*min;
            max=Math.max(Math.max(maxEnd,minEnd),arr[i]);
            min=Math.min(Math.min(maxEnd,minEnd),arr[i]);
            res=Math.max(res,max);

        }
        return res;

    }
}
