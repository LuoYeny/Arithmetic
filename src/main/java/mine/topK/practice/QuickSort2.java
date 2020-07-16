package mine.topK.practice;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/6 15:20
 */
public class QuickSort2 {

    public static void main(String[] args) {

        int[] a={2,3,4,5,6,7,11,8,11,2,3,4,2};
        new QuickSort2().solution(a,0,a.length-1,5);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static void solution(int[] arr,int left,int right,int k){
        if(left>right) return;
        int index= partion(arr,left,right);
        if(index==k){
            return;
        }else if(index>k){
            solution(arr,left,index-1,k);
        }else{
            solution(arr,index+1,right,k);
        }
    }

    public static int partion(int[] arr,int left,int right){
        int tmp=arr[left];
        while(left<right){
            while(left<right&&arr[right]>=tmp){
                right--;
            }
            arr[left]=arr[right];
            while(left<right&&arr[left]<tmp){
                left++;
            }
            arr[right]=arr[left];
        }
        arr[left]=tmp;
        return left;
    }

}
