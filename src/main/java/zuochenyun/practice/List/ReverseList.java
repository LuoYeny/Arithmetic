package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/8 16:10
 */
public class ReverseList {
    public Node reverseList(Node head){

        Node pre=null;
        Node next=null;
        while (head!=null){
             next=head.next;
             head.next=pre;
             pre=head;
             head=next;
        }
        return pre;
    }
    public DoubleNode reverseListForDoubleNode(DoubleNode head){

        DoubleNode pre=null;
        DoubleNode next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            head.last=next;
            pre=head;
            head=next;
        }
        return pre;
    }
}
