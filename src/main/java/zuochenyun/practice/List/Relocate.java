package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/15 16:04
 */
public class Relocate {
    public Node relocate(Node head){
        if(head==null||head.next==null)
            return head;
        Node fast=head.next;
        Node mid=head;//得到n/2的点

        while (fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            mid=mid.next;
        }

        Node right=mid.next;
        mid.next=null;
        Node left=head;

         merge(left,right);

         return head;



    }

    private void merge(Node left, Node right) {
        Node next=null;
        Node cur1=left;
        Node cur2=right;
        while (cur1.next!=null ){
            next=cur2.next;
            cur2.next=cur1.next;
            cur1.next=cur2;
            cur1=cur2.next;
            cur2=next;
        }

        cur1.next=cur2;//右边大于等于左边
    }
}
