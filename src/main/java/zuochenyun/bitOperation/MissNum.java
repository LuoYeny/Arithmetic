package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/5 16:57
 */
public class MissNum {
    public static int missNum(int[] a){
        int  l=0;
        int  r=a.length ;

        while(l<r){
            if(a[l]==l+1)
                l++;
            else if(a[l]<=l || a[l]>r || a[a[l]-1]==a[l])
                a[l] = a[--r];
            else
                swap(a, l,a[l]-1);
        }

        return l+1;
    }
    private static void swap(int[] arr, int u, int i) {
        int tmp=arr[u];
        arr[u]=arr[i];
        arr[i]=tmp;
    }

    public static void main(String[] args) {
        int[] arr={-1,7,5,1,4};
        System.out.println(missNum(arr));
    }
}
