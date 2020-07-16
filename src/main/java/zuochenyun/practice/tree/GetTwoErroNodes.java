package zuochenyun.practice.tree;


import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/19 14:41
 */
public class GetTwoErroNodes {
    public TreeNode[] getTowErroNodes(TreeNode head){
        if(head==null)
            return null;

        TreeNode[] erro=new TreeNode[2];
        Stack<TreeNode> stack=new Stack<>();
        TreeNode pre=null;
        while (!stack.isEmpty()||head!=null){
            if(head!=null){
                stack.push(head);
                head=head.left;
            }else {
                head=stack.pop();

                    if(pre!=null&&pre.val>head.val){
                        erro[0]=erro[0]==null?pre:erro[0];
                        erro[1]=head;

                }
                pre=head;
                head=head.right;
            }


        }

        return erro;
    }
}
