package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/4 16:17
 */
public class ProductSort {
    public static void sort(int[] arr){
        if(arr==null||arr.length==0)
            return;
        int left=-1;
        int index=0;
        int right=arr.length;
        while (index<right){
            if(arr[index]==0)
                swap(arr,++left,index++);
            else if(arr[index]==2)
                swap(arr,index,--right);
            else index++;
        }

    }
    private static void swap(int[] arr, int u, int i) {
        int tmp=arr[u];
        arr[u]=arr[i];
        arr[i]=tmp;
    }

    public static void main(String[] args) {
        int[] a={1,1,2,0,0};
        sort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
