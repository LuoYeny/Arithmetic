package Interview.zy;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/7 9:48
 */
public class SelectSort {
    public static void main(String[] args) {
        int arr[]={1,4,5,3,9,6};
        new SelectSort().selectSort(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public void selectSort(int[] arr){
        if(arr==null||arr.length==0)
            return;
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            min=arr[i];
            index=i;
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }

            swap(arr,i,index);

        }
    }

    private void swap(int[] arr, int i, int j) {
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
