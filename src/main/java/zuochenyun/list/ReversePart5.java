package zuochenyun.list;

public class ReversePart5 {
    public static class Node {
        int value;
        Node next = null;

        public Node(int value) {
            this.value = value;
        }
    }
    public static Node reversePart(Node head,int from ,int to){
        int len=0;
        Node node1=head;
        Node fHead=null;
        Node tail=null;
        while (node1!=null){
            len++;
            fHead=len==from-1?node1:fHead;
            tail=len==to+1?node1:tail;
        }

        if(from<0||to>=from||to>len){
            return head;
        }
        node1=fHead==null?head:fHead.next;
        Node node2=node1.next;
        //把要反转的部分的头结点接上反转结点的后面的结点
        node1.next=tail;
        Node next=null;
        while (node2!=tail){
            next=node2.next;
            node2.next=node1;
            node1=node2;
            node2=next;

        }
        return head;
    }

}
