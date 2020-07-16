package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/17 14:44
 */
//最小深度
public class MinDeepth {
    public int minDeepth(TreeNode head){
        if(head==null)
            return 0;

        int min =getMinDeep(head,1);

        return min;

    }

    private int getMinDeep(TreeNode head,int level) {
        if(head.left==null&&head.right==null){
            return level;
        }

        int min=Integer.MAX_VALUE;
        if(head.left!=null){
            min=Math.min(getMinDeep(head.left,level+1),min);
        }


        if(head.right!=null){
            min=Math.min(getMinDeep(head.right,level+1),min);
        }

        return min;
    }
}
