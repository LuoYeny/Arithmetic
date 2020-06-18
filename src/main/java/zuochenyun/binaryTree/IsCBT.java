package zuochenyun.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class IsCBT {
    public boolean isCBT(Node head){
        if(head==null) return true;
        Node l=null;
        Node r =null;
        Queue<Node> queue = new LinkedList<Node>();
        boolean leaf =false;
        queue.add(head);
        while (!queue.isEmpty()){
            head=queue.poll();
            l=head.left;
            r=head.right;
            if ((leaf&&(l!=null||r!=null))||(l==null&&r!=null)) {
                return  false;
            }
            if(l!=null)
                queue.offer(l);
            if (r!=null)
                queue.offer(r);
            else leaf=true;  //下一个结点为叶子结点
        }
        return true;
    }
}
