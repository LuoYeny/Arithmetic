package zuochenyun.practice.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/18 15:44
 */
public class PrintByZigZag {
    public void printByZigZag(TreeNode head){
        if(head==null)
            return;

        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode last=head;
        TreeNode nlast=null;
        boolean lr=true;
        int level=1;
        queue.offerFirst(head);
        levelPrint(lr);
        System.out.println("level : "+level++);

        while (!queue.isEmpty()){
            if(lr){
                if(head.left!=null){
                    queue.offerLast(head.left);
                    nlast=nlast==null?head.left:nlast;
                }
                head=queue.pollFirst();
                if(head.right!=null){
                    queue.offerLast(head.right);
                    nlast=nlast==null?head.right:nlast;
                }



            }else {
                head=queue.pollLast();

                if(head.right!=null){
                    queue.offerFirst(head.right);
                    nlast=nlast==null?head.right:nlast;
                }
                if(head.left!=null){
                    queue.offerFirst(head.left);
                    nlast=nlast==null?head.left:nlast;
                }



            }
            System.out.print(head.val+" ");
            if(head==last&&!queue.isEmpty()){
                lr=!lr;
                levelPrint(lr);
                System.out.println("level "+level++);

                last=nlast;
                nlast=null;
            }
        }




    }

    private void levelPrint(boolean lr) {
        System.out.println();
        System.out.print(lr?"left to right":"right to left");
    }
}
