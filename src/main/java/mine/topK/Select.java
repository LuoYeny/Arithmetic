package mine.topK;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/6 15:10
 */
public class Select {

    public static void main(String[] args) {

        int[] a={2,3,4,5,6,7,8,11,2,3,4,22};
        new Select().topK(a,5);
    }
    public void topK(int[] arr,int k){
     if(arr==null||arr.length<k)
         return;
        sort(arr,k);

        for (int i = 0; i <k ; i++) {
            System.out.print (arr[i]+" ");

        }
    }

    private void sort(int[] arr, int k) {
        int index = 0;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i <k ; i++) {
            index=i;
            max=arr[i];
            for (int j = i; j <arr.length ; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    index=j;
                }

            }

            swap(arr,i,index);
        }

    }

    private void swap(int[] arr, int i, int j) {
        int tmp =arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;

    }
}
