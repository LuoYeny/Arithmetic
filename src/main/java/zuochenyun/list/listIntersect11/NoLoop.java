package zuochenyun.list.listIntersect11;

public class NoLoop {
    //返回相交链表的第一个结点，或者null
    public Node noLoop(Node head1,Node head2){
        if(head1==null||head2==null)
            return null;
        int n=0;
        Node cur1=head1;
        Node cur2 =head2;
        while (cur1.next!=null){
            n++;
            cur1=cur1.next;
        }
        while (cur2.next!=null){
            n--;
            cur2=cur2.next;
        }

        //保证cur1指向较长的链表
        cur1=n>0?head1:head2;
        cur2=cur1==head1?head2:head1;
       n= Math.abs(n);
       while (n!=0){
           n--;
           cur1=cur1.next;
       }
       while (cur1!=cur2){
           cur1=cur1.next;
           cur2=cur2.next;
       }



       return cur1;
    }
}
