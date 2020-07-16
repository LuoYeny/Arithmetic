package zuochenyun.practice.tree;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/23 17:22
 */
//判断一棵树是否为搜索二叉树
public class IsBST {
    public boolean isBST(TreeNode head){
        if(head==null)
            return false;
        TreeNode pre=null;

        Stack<TreeNode> stack= new Stack<>();
        while (!stack.isEmpty()||head!=null){
            if(head!=null){
                stack.push(head);
                head=head.left;
            }else {
                 head =stack.pop();
                if(pre!=null&&pre.val>head.val){

                        return false;
                }
                pre=head;
                head=head.right;

            }
        }

        return true;

    }
}
