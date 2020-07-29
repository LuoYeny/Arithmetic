package zuochenyun.practice.matrix;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/21 15:55
 */
//未排序数组中的最小正整数,最小进程号
public class MissNum {
    public int missNum(int[] arr){
        int l=0;
        int r=arr.length-1;
        while (l<r){
            if(arr[l]==l+1){
                l++;
                //这里表示当前位置的arr[l]是不合理的可以被抛弃的
            }else if(arr[l]<=l||  //表示该arr[l]前面已经出现过了
                    arr[l]>r||  //表示该arr[l]超出了r的范围
                    arr[arr[l]-1]==arr[l]) //表示已经arr[l]范围合理但是已经由arr[l]放在正确的位置上面了
            {
                arr[l]=arr[--r];
            }else {
                swap(arr,l,--r);
            }
        }

        return l+1;
    }

    private void swap(int[] arr, int l, int r) {
        int tmp =arr[l];
        arr[l]=arr[r];
        arr[r]=tmp;

    }
}
