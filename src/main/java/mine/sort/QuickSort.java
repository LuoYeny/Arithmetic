package mine.sort;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/4 16:24
 */
public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        if(arr==null||arr.length==0)
            return;
        if(low>=high)//递归边界
            return;
            int index=partion(arr,low,high);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);

    }

    private static int partion(int[] arr, int low, int high) {
        int tmp=arr[low];

        while (low<high){

            while (arr[high]>=tmp&&low<high){
                high--;
            }
            arr[low]=arr[high];
            while (arr[low]<tmp&&low<high){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=tmp;
        return low;
    }

    public static void main(String[] args) {
        int[] a={2,5,4,66,8,12,6};
        quickSort(a,0,6);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
