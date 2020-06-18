package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/10 17:13
 */
public class AddList {
    public Node addList(Node head1,Node head2){
       head1= reverseList(head1);
       head2= reverseList(head2);
        System.out.println();
        Node cur=head2;
        System.out.println();
        while (cur!=null){
            System.out.print(cur.value+" ");
            cur=cur.next;
        }
       int n=0;
       int n1=0;
       int n2=0;
       int ca=0;
       Node node1=head1;
       Node node2=head2;
       Node pre=null;
       Node node=null;
        System.out.println();
       while (node1!=null||node2!=null){
           n1=node1!=null?node1.value:0;
           n2=node2!=null?node2.value:0;
           n=n1+n2+ca;
           pre=node;

           System.out.println("n1  "+n1);
           System.out.println("n2  "+n2);
           System.out.println("n1+n2+ca  "+n);
           System.out.println("n%10  "+n%10);
           node=new Node(n%10);
           node.next=pre;   //逆向链接链表

           ca=n/10;
           node1=node1==null?null:node1.next;
           node2=node2==null?null:node2.next;

       }
       if(ca==1){
           pre=node;
           node=new Node(1);
           node.next=pre;
       }
       reverseList(head1);
       reverseList(head2);
          cur=node;
        System.out.println();
        while (cur!=null){
            System.out.print(cur.value+" ");
            cur=cur.next;
        }
       return node;


    }

    private Node reverseList(Node head) {
        if(head==null)
            return head;
        Node pre=null;
        Node cur=head;
        Node next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
