package zuochenyun.list;

public class ReverseList4 {
    public static class Node{
        int value;
        Node next =null;

        public Node(int value) {
            this.value = value;
        }
    }
    public static class DoubleNode{
        int value;
        DoubleNode next =null;
        DoubleNode last=null;

        public DoubleNode(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node rel = reverseNodeList(head);
    }

    private static Node reverseNodeList(Node head) {

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
    private static DoubleNode reverseDoubleNodeList(DoubleNode head) {

        DoubleNode pre=null;
        DoubleNode next  = null;
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
