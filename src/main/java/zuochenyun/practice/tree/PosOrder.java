package zuochenyun.practice.tree;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/16 15:43
 */
public class PosOrder {
    public void posOrderByRecursion(TreeNode head){
        if(head==null)
            return;
        posOrderByRecursion(head.left);
        posOrderByRecursion(head.right);
        System.out.print(head.val+"  ");
    }

    public void posOrderByStack(TreeNode head) {
        if (head == null)
            return;


        System.out.println("posOder:   ");
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();

        stack1.add(head);
        while (!stack1.isEmpty()){
            head=stack1.pop();
            stack2.push(head);
            if(head.left!=null)
                stack1.push(head.left);
            if(head.right!=null)
                stack1.push(head.right);

        }

        while (!stack2.isEmpty()){
            System.out.print(stack2.pop().val+"  ");
        }
    }
}
