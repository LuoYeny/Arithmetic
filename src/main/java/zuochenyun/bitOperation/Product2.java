package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/4 15:11
 */
public class Product2 {
    public static int[] product(int[] arr){
        if(arr==null||arr.length==0)
            return null;
        int[] res=new int[arr.length];
        res[0]=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            res[i]=res[i-1]*arr[i];

        }
        int tmp=1;
        for (int i = arr.length-1; i >0 ; i--) {
            res[i]=tmp*res[i-1];
            tmp*=arr[i];
        }
        res[0]=tmp;
        return res;

    }

    public static void main(String[] args) {
        int[] a={1,3,4,5,0};
        int[] r=product(a);
        for (int i = 0; i <r.length ; i++) {
            System.out.print(r[i]+" ");
        }
    }
}
