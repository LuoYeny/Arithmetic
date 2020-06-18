package zuochenyun.binaryTree;

public class IsPostArray {
    public static boolean isPostArray(int[] arr){
        if(arr==null||arr.length==0)
            return false;
        boolean rel =isPost(arr,0,arr.length-1);
        return rel;

    }

    private static boolean isPost(int[] arr, int start, int end) {
        if(start==end)
            return true;
        int less=-1;
        int more=end;
        for (int i = start; i <end ; i++) {
            if(arr[end]>arr[i])
                less=i;
            else more=more==end?i:more;
        }
        if(less==-1||more==end){//没有左子树或者右子树的情况
            return isPost(arr,start,end-1);
        }

        return isPost(arr,start,less)&&isPost(arr,more,end-1);
    }

    public static void main(String[] args) {
        int[] a={2,1,3,6,5,7,4};
        System.out.println(isPostArray(a));
    }
}
