package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 14:56
 */
//二叉搜索树的后序数组重建二叉树
public class PosArrayToBST {
    public TreeNode posArrayToBST(int[] array){
        if(array==null||array.length==0)
            return null;
        TreeNode node= solution(array,0,array.length-1);
        return node;
    }

    private TreeNode solution(int[] array, int start, int end) {
        if(start>end)
            return null;
        int less=-1;
        int more=end;
        TreeNode node = new TreeNode(array[end]);
        for (int i = 0; i <end ; i++) {
            if(array[i]<array[end])
                less=i;
            else more=more==end?i:more;
        }

        node.left=solution(array,start,less);
        node.right=solution(array,more,end-1);

        return node;


    }
}
