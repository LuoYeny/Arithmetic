package zuochenyun.list;

public class JosehusKill6 {
    public static class Node {
        int value;
       Node next = null;

        public Node(int value) {
            this.value = value;
        }
    }
    public static Node josehusKill(Node head , int m){
        if(head==null||head.next==null||m<1)
            return head;
        Node last= head;
        while (last.next!=head)
            last=last.next;
        int count=0;
        while (head!=last){
            count++;
         if(count==m){
            last.next=head.next;
             count=0;
         }else {
             last=last.next;
         }

         head=last.next;



        }
        return head;
    }
}
