package mine.topK.practice;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/6 15:20
 */
public class QuickSort1 {

    public static void main(String[] args) {

        int[] a={2,3,4,5,6,7,11,8,11,2,3,4,2};
        new QuickSort1().topK(a,5);

    }
    public void topK(int[] arr,int k){

        sort(arr,k,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print (arr[i]+"  ");
        }
    }

    private void sort(int[] arr, int k, int left, int right) {

        int mid = partion(arr, left,right);

//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print (arr[i]+"  ");
//        }
        while (mid!=k){
            if(mid<k){
             mid=   partion(arr, mid+1,right);
            }else {
            mid=    partion(arr, left,mid-1);
            }

        }
    }

    private int partion(int[] arr,   int left, int right) {
        int tmp=arr[left];
        while (left<right){
            while (arr[right]<=tmp&&right>left){
                right--;
            }
            arr[left]=arr[right];

            while (arr[left]>tmp&&left<right){
                left++;
            }
            arr[right]=arr[left];


        }

        arr[left]=tmp;
        return left;

    }

}
