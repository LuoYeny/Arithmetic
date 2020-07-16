package enterprise.zj;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/16 17:35
 */


public class Reverse {
    public static void main(String[] args) {
        Node node = new Node(0);
        Node head = node;
        for (int i = 1; i < 5; i++) {
            node.next = new Node(i);
            node = node.next;
        }
        Node newhead = new Reverse().solution(head);
        while (newhead != null) {
            System.out.print(newhead.value + " ");
            newhead = newhead.next;
        }
    }


    public Node solution(Node head){
        Node pre =null;
        Node next = null;
        Node cur =head;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }

        return pre;

    }

}
