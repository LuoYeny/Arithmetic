package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/2 17:11
 */
public class MaxSumOfMatrix {
    public static int maxSum(int[][] arr){
        if(arr==null||arr.length==0||arr[0].length==0)
            return 0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        int s[]=null;
        for (int i = 0; i <arr.length ; i++) {
            s=new int[arr[i].length];
            for (int j = i; j <arr.length ; j++) {
                sum=0;
                for (int k = 0; k <s.length ; k++) {
                    s[k]+=arr[j][k];
                    sum+=s[k];
                    max=Math.max(sum,max);
                    sum=sum>0?sum:0;
                }
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int[][] arr={{-1,-1,-1},{-1,2,2},{-1,-1,-1}};
        System.out.println(maxSum(arr));

    }
}
