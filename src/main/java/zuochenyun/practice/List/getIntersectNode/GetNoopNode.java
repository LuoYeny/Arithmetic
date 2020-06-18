package zuochenyun.practice.List.getIntersectNode;

import zuochenyun.practice.List.Node;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/11 15:32
 */
public class GetNoopNode {
    public Node getNoopNode(Node head){
        if(head==null||head.next==null||head.next.next==null)
            return null;
        Node slow=head.next;
        Node fast=head.next.next;
        while (fast!=slow){
            if(fast.next==null||fast.next.next==null)
                return null;
            fast=fast.next.next;
            slow=slow.next;
        }
        fast=head;
       while (fast!=slow){
           fast=fast.next;
           slow=slow.next;
       }

       return fast;

    }
}
