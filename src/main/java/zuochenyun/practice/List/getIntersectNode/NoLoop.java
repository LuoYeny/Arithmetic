package zuochenyun.practice.List.getIntersectNode;

import zuochenyun.practice.List.Node;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/11 15:45
 */
public class NoLoop {
    public Node noLoop(Node head1,Node head2){

        if(head1==null||head2==null)
            return null;
        Node cur1=head1;
        int n=0;
        while (cur1!=null ){
           n++;
           cur1=cur1.next;
        }
       Node cur2=head2;
        while (cur2!=null ){
            n--;
            cur2=cur2.next;
        }
        if(cur1!=cur2)
            return null;
        cur1=n>0?head1:head2;
        cur2=cur1==head1?head2:head1;
        Math.abs(n);
        for (int i = 0; i <n ; i++) {
            cur1=cur1.next;
        }
        while (cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;

    }
}
