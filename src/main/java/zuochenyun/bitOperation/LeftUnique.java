package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/4 15:55
 */
public class LeftUnique {
    public static void leftUnique(int[] arr){
        if(arr==null||arr.length<2)
            return;
        int u=0;

        for (int i = 1; i <arr.length  ; i++) {
            if(arr[u ]!=arr[i]){
                u++;
                swap(arr,u,i);
            }


        }
    }

    private static void swap(int[] arr, int u, int i) {
        int tmp=arr[u];
        arr[u]=arr[i];
        arr[i]=tmp;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,3,3,4,4,5,5,6,6,7,7,8};
        leftUnique(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
