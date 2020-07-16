package zuochenyun.practice.matrix;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 15:54
 */
//数组的子数组的最大乘积
public class MaxProduct {
    public static void main(String[] args){

        double [] arr = {-2.5 ,4, 0, 3, 0.5, 8, -1};
        double [] arr1 = {-1,2,3,-1,-8};

        double res=  solution(arr1);

        System.out.print(String.format("%.2f", res));

    }

    public static double solution(double [] arr){
        double max= arr[0];
        double min =arr[0];
        double res= arr[0];
        double maxEnd=0;
        double minEnd=0;
        for(int i=1;i<arr.length;i++){
            maxEnd=max*arr[i];
            minEnd=min*arr[i];
            min=Math.min(arr[i],Math.min(minEnd,maxEnd));
            max=Math.max(arr[i],Math.max(minEnd,maxEnd));
            res=Math.max(res,max);
        }

        return max;
    }
}
