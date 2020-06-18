package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/15 15:06
 */
public class Merge {
    public Node merge(Node head1,Node head2){
        while (head1==null&&head2==null)
            return null;

        Node head=head1.value<head2.value?head1:head2;
        Node cur=head1.value<head2.value?head1:head2;
        Node cur2=cur==head1?head2:head1;
        Node pre=null;
        Node next=null;
        while (cur!=null&&cur2!=null){

            if(cur.value<=cur2.value){//<=
                pre=cur;
                cur=cur.next;
            }else {
                next=cur2.next;
                pre.next=cur2;
                cur2.next=cur;
                pre=cur2;
                cur2=next;
            }

        }
        pre.next=cur==null?cur2:cur;

        return head;


    }
}
