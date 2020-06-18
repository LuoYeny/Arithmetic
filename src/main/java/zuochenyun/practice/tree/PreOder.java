package zuochenyun.practice.tree;


import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/16 15:07
 */
public class PreOder {
    public void preOderByRecursion(TreeNode head){
        if(head==null)
            return;

        System.out.print(head.val+"  ");
        preOderByRecursion(head.left);
        preOderByRecursion(head.right);
    }


    public void preOderByStack(TreeNode head){
        if(head==null)
            return;


        Stack<TreeNode> stack= new Stack<>();

        stack.add(head);
        System.out.println("preOder:  ");
        while (!stack.isEmpty()){
            head=stack.pop();
            System.out.print(head.val+"  ");
            if(head.right!=null){
                stack.push(head.right);
            }
            if(head.left!=null){
                stack.push(head.left);
            }
        }
        System.out.println();

    }
}
