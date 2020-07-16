package zuochenyun.practice.tree;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/19 15:01
 */
//判断一颗二叉树t1是否包含另一颗二叉树t2的拓扑结构
public class Contain {
    public boolean contain(TreeNode t1,TreeNode t2){
        if(t1==null||t2==null)
            return false;

        return check(t1,t2)||contain(t1.left,t2)||contain(t1.right,t2);
    }

    private boolean check(TreeNode t1, TreeNode t2) {
        if(t2==null)
            return true;
        if(t1==null||t1.val!=t2.val)
            return false;
        return check(t1.right,t2.right)||check(t1.left,t2.left);
    }
}
