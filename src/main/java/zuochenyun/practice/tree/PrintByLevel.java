package zuochenyun.practice.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/18 15:22
 */
//按层打印
public class PrintByLevel {
    public void printByLevel(TreeNode head){
        if (head==null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
       int level=0;
        TreeNode last=head;
        TreeNode nlast=null;
        TreeNode cur=null;
        queue.offer(head);
        System.out.println  ("level: "+level++);
        while (!queue.isEmpty()){
            cur=queue.poll();
            System.out.print(cur.val+"  ");
            if(cur.left!=null){
                queue.offer(cur.left);
                nlast=cur.left;
            }
            if(cur.right!=null){
                queue.offer(cur.right);
                nlast=cur.right;
            }

            if(cur==last&&!queue.isEmpty()){
                System.out.println();
                System.out.println ("level: "+level++);
                last=nlast;

            }
        }

    }
}
