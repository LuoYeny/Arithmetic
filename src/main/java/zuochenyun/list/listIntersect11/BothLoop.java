package zuochenyun.list.listIntersect11;

public class BothLoop {
    //判断两个有环链表 是否相交
    //1.两个链表在到环之前的节点就相交
    //2.两个链表公用一个环

    public Node bothLoop(Node head1,Node loop1,Node head2,Node loop2){
        Node cur1=null;
        Node cur2=null;
        if(loop1==loop2){
            cur1=head1;
            cur2=head2;
            int n=0;
            while (cur1!=loop1){
                n++;
                cur1 =cur1.next;
            }
            while (cur2!=loop1){
                n++;
                cur2 =cur2.next;
            }
            cur1=n>0?head1:head2;
            cur2=cur1==head1?head2:head1;
            n=Math.abs(n);
            while (n!=0){
                n--;
                cur1=cur1.next;
            }
            while (cur1!=cur2){
                cur1=cur1.next;
                cur2=cur2.next;
            }
            return cur1;

        }else {
            cur1=loop1.next;
            while (cur1!=loop1){
                if(cur1==loop2)
                    return loop1;
                 cur1=cur1.next;
            }
            return null;
        }
    }
}
