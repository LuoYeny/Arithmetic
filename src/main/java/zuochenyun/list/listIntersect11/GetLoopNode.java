package zuochenyun.list.listIntersect11;

public class GetLoopNode {
    /*
    判断一个链表是否有环，如果有则返回环的入口，如果没有则返回null
     */
    public Node  getLoopNode(Node head){
        if(head==null||head.next==null||head.next.next==null){
            return null;
        }
        Node fast=head.next.next;
        Node slow=head.next;
        while (fast!=slow){
            if(fast.next==null||fast.next.next==null)
                return null;
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;

        }
        return fast;
    }
}
