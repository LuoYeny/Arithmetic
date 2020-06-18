package zuochenyun.bitOperation;

public class GetMaxLength {
    public int getmaxLength(int[] arr,int k){
        if(arr.length==0||k<=0||arr==null)
            return 0;

        int left=0;
        int right=0;
        int len=0;
        int sum=arr[0];
        while (right<arr.length){
            if(sum==k){
               len=Math.max(len,right-left);
                sum-=arr[left++];
            }else if(sum<k){
                right++;
                if(right==arr.length)
                    break;
                sum+=arr[right ];
            }else {
                sum-=arr[left++];
            }
        }
        return  len;
    }
}
