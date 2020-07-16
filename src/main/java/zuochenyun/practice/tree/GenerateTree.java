package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 15:16
 */
//通过有序数组生成平衡二叉树，并且二叉树的中序遍历结果为有序数组
public class GenerateTree {
    public TreeNode generateTree(int[] array){
        if(array==null)
            return null;
        TreeNode node = solution(array,0,array.length-1);
        return node;
    }

    private TreeNode solution(int[] array, int start, int end) {
        if(start>end)
            return null;

        int mid=(start+end)/2;
        TreeNode head = new TreeNode(array[mid]);
        head.left=solution(array,start,mid-1);
        head.right=solution(array,mid+1,end);
        return head;

    }

}
