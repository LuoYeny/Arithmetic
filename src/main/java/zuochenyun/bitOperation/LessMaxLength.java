package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/2 14:51
 */
public class LessMaxLength {
    public int lessMaxLength(int[] arr,int k){
        int[] helpArr=new int[arr.length+1];
        helpArr[0]=0;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            helpArr[i+1]=Math.max(sum,helpArr[i]);
        }
        sum=0;
        int pre=0;
        int res=0;
        int len=0;

        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            pre=getLessIndex(helpArr,sum-k);
            len=pre==-1?0:i-pre+1;//pre=-1 helpArr中没有大于sum-k的数
            res=Math.max(len,res);
        }
        return res;
    }
       //helpArr中大于t的最小值
    private int getLessIndex(int[] helpArr, int t) {
        int high=helpArr.length-1;
        int low=0;
        int mid=0;
        int res=-1;
        while (low<=high){
            mid=(low+high)/2;
            if(helpArr[mid]>=t){
                res=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }

        return res;

    }
}
