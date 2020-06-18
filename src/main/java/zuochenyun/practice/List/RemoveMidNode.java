package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/8 15:46
 */
public class RemoveMidNode {
    public Node removeMidNode(Node head){
        if(head==null&&head.next==null)
            return head;
        if(head.next.next==null)
            return head.next;
        Node first=head.next.next;
        Node last=head;
        while (first.next!=null&&first.next.next!=null){
            first=first.next.next;
            last=last.next;
        }
        last.next=last.next.next;


        return head;

    }
}
