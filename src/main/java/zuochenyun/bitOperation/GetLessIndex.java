package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/3 15:12
 */
public class GetLessIndex {
    public int getLessIndex(int[] arr){
        if (arr==null||arr.length==0)
            return -1;
        if(arr.length==1||arr[0]<arr[1])
            return arr[0];
        if(arr[arr.length-1]<arr[arr.length-2])
            return arr[arr.length-1];

        int left=1;
        int right=arr.length-2;
        int mid=0;
        while (left<right){
            mid=(right+left)/2;
            if(arr[mid]>arr[mid+1])
                left=mid+1;
            else if(arr[mid]>arr[mid-1])
                right=mid-1;
            else return mid;
        }
        return left;
    }
}
