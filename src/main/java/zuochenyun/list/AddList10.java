package zuochenyun.list;

public class AddList10 {
    public static class Node {
        int value;
        Node next = null;

        public Node(int value) {
            this.value = value;
        }
    }
    public Node addList(Node head1,Node head2){
        head1=reverseNodeList(head1);
        head2=reverseNodeList(head2);
        Node h1=head1;
        Node h2=head2;
        int ca=0;
        int n1=0;
        int n2=0;
        int n=0;
        Node node=null;
        Node pre =null;
        while (h1!=null||h2!=null){
            n1=h1==null?0:h1.value;
            n2=h2==null?0:h2.value;
            pre=node;
            n=n1+n2+ca;
            node=new Node(n%10);
            node.next=pre;
            h1=h1!=null?h1.next:null;
            h2=h2!=null?h2.next:null;
            ca=n/10;
        }
        if(ca==1){
            pre=node;
            node = new Node(1);
            node.next=pre;

        }
        head1=reverseNodeList(head1);
        head2=reverseNodeList(head2);
        return node;
    }

    private static  Node reverseNodeList( Node head) {

         Node pre=null;
        Node next = null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;

        }
        return pre;
    }
}
