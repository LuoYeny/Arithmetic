package zuochenyun.list.reverseKNode12;

import java.util.Stack;

public class ReverseKNode2 {
    public Node reversKnode(Node head ,int K){
        if(K<2)
            return head;
        Node cur=head;
   
        Node next=null;
        Node pre=null;
        Node start=null;
        int count=1;
        while (cur!=null){
            next =cur.next;
            while (count==K){
                start =pre==null?head:pre.next;
                head=pre==null?cur:head;//第一次旋转的头结点pre==null
                reverse(pre,start,cur,next);
                count=0;
                pre=start;
            }
            cur=next;
            count++;

        }
        return head;
    }

    private void reverse(Node left, Node start, Node end, Node right) {
        Node pre=start;
        Node next =null;
        Node node=start.next;
        while (node!=end){
            next=node.next;
            node.next=pre;
            pre=node;
            node=next;

        }
        while (left!=null)
            left.next=end;

        start.next=right;
    }
}
