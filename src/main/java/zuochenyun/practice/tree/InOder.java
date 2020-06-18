package zuochenyun.practice.tree;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/16 15:20
 */
public class InOder {
    public void inOderByRecursion(TreeNode head){
        if(head==null)
            return;

        inOderByRecursion(head.left);
        System.out.print(head.val+"  ");
        System.out.println(head.right);

    }

    public void inOderByStack(TreeNode head){
        if(head==null)
            return;
        System.out.println("inOder :");

        Stack<TreeNode> stack= new Stack<>();
        while (!stack.isEmpty()||head!=null){
            if(head!=null){
                stack.push(head);
                head=head.left;
            }else {
                head=stack.pop();
                System.out.print(head.val+"  ");
                head=head.right;
            }
        }
        System.out.println();
    }
}
