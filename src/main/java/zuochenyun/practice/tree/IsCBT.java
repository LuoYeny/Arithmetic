package zuochenyun.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/24 14:41
 */
//判断一棵树是否为完全二叉树
public class IsCBT {
    //当前节点并不是左右子树都有，则后面节点全部为叶子节点
    //右子树不为空，左子树为空-----false
    //
    public boolean isCBT(TreeNode head){
        if(head==null)
            return true;
        boolean leaf =false;
        TreeNode l=null;
        TreeNode r=null;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.offer(head);
        while (!queue.isEmpty()){
            head=queue.poll();
            l=head.left;
            r=head.right;
            if((leaf&&(r!=null||l!=null))||(r!=null&&l==null)){
                        return false;
            }

            if(l!=null)
                queue.offer(l);
            if(r!=null)
                queue.offer(r);
            else leaf=true; //表示的是当前树是有一颗子树为null,或者两颗子树为null的情况
                           //leaf==true，表示下一个节点为叶子节点

        }
        return true;
    }
}
