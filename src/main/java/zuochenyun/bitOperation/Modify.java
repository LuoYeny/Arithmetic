package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/2 16:29
 */
public class Modify {
    public void modify(int[] arr){
        int odd=1;
        int even=0;

        int end=arr.length-1;
        while (odd<=end&&even<=end){
            if((arr[end]&1)==0){   //判断奇数偶数
                swap(arr,end,even);
                even+=2;
            }else {
                swap(arr,end,odd);
                odd+=2;
            }
        }
    }

    private void swap(int[] arr, int end, int even) {
        int tmp=arr[end];
        arr[end]=arr[even];
        arr[even]=tmp;
    }
}
