package zuochenyun.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class GetTowErrNodes {
    public Node[] getTowEorrNodes(Node head){
        if(head==null) return null;
        Queue<Node> queue = new LinkedList();
        Node[] err= new Node[2];
        Node pre=null;
        while (!queue.isEmpty()||head!=null){
            if(head!=null){
                queue.add(head);
                head=head.left;
            }else {
                head=queue.poll();
                pre=head;
                if(pre!=null&&pre.value>head.value){
                    err[0]=err[0]==null?pre :err[0];
                    err[1]=head;
                }
                head=head.right;

            }

        }
        return err;
    }
}
