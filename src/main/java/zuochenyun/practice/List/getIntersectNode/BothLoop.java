package zuochenyun.practice.List.getIntersectNode;

import zuochenyun.practice.List.Node;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/11 16:01
 */
public class BothLoop {
    public Node bothLoop(Node head1,Node loop1,Node head2,Node loop2){

        if(loop1!=loop2) {
            Node cur1 = head1;
            Node cur2 = head2;
            int n = 0;
            while (cur1 != null) {
                n++;
                cur1 = cur1.next;
            }
            while (cur2!=null){
                n--;
                cur2=cur2.next;
            }
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

        }else {
           Node cur=loop1.next;
            while (cur!=loop1){
                if(cur==loop2)
                    return loop2;
                cur=cur.next;
            }
            return null;
        }

    }
}
