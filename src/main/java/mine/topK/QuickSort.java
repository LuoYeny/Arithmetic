package mine.topK;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/6 22:18
 */
//时间复杂度是O(n)。
public class QuickSort {
    public void topK(int[] arr,int k){

        sort(arr,k,0,arr.length-1);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print (arr[i]+"  ");

        }
    }
    public void sort(int[] arr,int k,int left,int right){
        if(left>right) return;

        int index=partion(arr,left,right);
        while (k!=index){

            if(k>index)
              index=  partion(arr,index+1,right);
            else index=partion(arr,left,index-1);
        }





    }


    private int partion(int[] arr,int left,int right){
        int tmp=arr[left];

        while (left<right){
            while (tmp<=arr[right]&&left<right){
                right--;
            }

          arr[left]=arr[right];
            while (tmp>arr[left]&&left<right){
                left++;
            }

            arr[right]=arr[left];
        }
        arr[left]=tmp;
        return left;

    }
    public static void main(String[] args) {
        QuickSort heap= new QuickSort();
        int[] a={2,3,4,5,6,7,8,11,2,3,4,22};
        heap.topK(a,5);
    }
}
