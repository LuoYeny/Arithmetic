package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/22 16:08
 */
//判断一个数组是否是搜索二叉树的后序遍历数组
public class IsPosArray {
    public boolean isPosArray(int[] array){
        if(array==null||array.length==0)
            return false;
        int len=array.length-1 ;
        int end=len;
        int start=0;


        boolean res=solution(array,start,end);
        return res;

    }

    private boolean solution(int[] array, int start, int end) {
        if(start==end)
            return true;
        int left=-1;
        int right=end;
        for (int i = start; i <end ; i++) {
            if(array[i]<array[end]){
                left=i;
            }else right=right==end?i :right;
        }
        if(left>right)return false;
        if(left==-1||right==end){//链表二叉树
            solution(array,start,end-1);
        }

        return solution(array,start,left)&&solution(array,right,end-1);

    }
}
