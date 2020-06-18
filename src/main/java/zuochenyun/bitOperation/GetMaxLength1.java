package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/1 15:40
 */
public class GetMaxLength1 {
    public int getMaxLength(int[] arr,int k){
        int left=0;
        int right=0;
        int sum=arr[0];
        int len=0;
        while (right<arr.length){
            if(sum==k){
                len=Math.max(right-left-1,len);
                sum=sum-arr[left];
                left++;
            }else if(sum<k){
                right++;
                if(right==arr.length)
                    break;
                sum+=arr[right];
            }else {
                left++;
                sum-=arr[left];
            }

        }
        return len;

    }
}
