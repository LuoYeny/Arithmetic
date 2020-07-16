package zuochenyun.practice.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/19 15:28
 */
//序列化和反序列化一颗二叉树
public class SerializeTree {
   public String serialize(TreeNode head) {
        while (head==null)
            return "#!";
        String res=head.val+"!";
        res+=serialize(head.left);
        res+=serialize(head.right);
        return res;


    }
    public  TreeNode deserialize(String str) {
       String[] chars=str.split("!");
        Queue<String> queue= new LinkedList<>();
        for (int i = 0; i <chars.length ; i++) {
            queue.offer(chars[i]);
        }

        return deserializePreOder(queue);



    }

    private TreeNode deserializePreOder(Queue<String> queue) {
        String value=queue.poll();
        if (value.equals("#"))
            return null;
        TreeNode head = new TreeNode(Integer.valueOf(value));
        head.left=deserializePreOder(queue);
        head.right=deserializePreOder(queue);
        return head;

    }
}
