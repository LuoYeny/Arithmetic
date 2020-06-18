package mine.sort;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/4 17:00
 */
public class QuickSort3 {
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high)return;
        int left=low;
        int right=high;
        int mid=left+1;
        int tmp=arr[low];
        while (mid<=right){
            if(arr[mid]<tmp)
                swap(arr,mid++,left++);
            else if(arr[mid]>tmp)
                swap(arr,mid,right--);
            else mid++;
        }
        quickSort(arr,low,left-1 );
        quickSort(arr,right+1,high);
    }
    private static void swap(int[] arr, int u, int i) {
        int tmp=arr[u];
        arr[u]=arr[i];
        arr[i]=tmp;
    }
    public static void main(String[] args) {
        int[] a={2,5,4,66,8,8,8,12,6};
        quickSort(a,0,8);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
