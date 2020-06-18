package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/8 15:09
 */
public class RemoveLastKthNode {
    public static Node removeLastKthNode1(Node head ,int k){
        while (head==null||k<1)
            return head;
        Node first=head;
        Node last=head;
        Node pre=head;
        int i=0;
        while (first!=null&&i<k){
            first=first.next;
            i++;
    }
        if(first==null&&i==k){
            head=head.next;
            pre.next=null;
            return head;
        }

        if(first==null)
            return head;

        while (first.next!=null ){
            first=first.next;
            pre=pre.next;
        }
        pre.next=pre.next.next;
        return head;
    }



    public static Node removeLastKthNode2(Node head ,int k){
        while (head==null||k<1)
            return head;
        Node p1=head;
        int index=k;
        while (p1!=null){
            index--;
            p1=p1.next;
        }
        if(index==0){
            head=head.next;
        }else if(index<0){
            p1=head;
            while (++index<0){
                p1=p1.next;

            }
            p1.next=p1.next.next;
        }
        return head;
    }



    public static void main(String[] args) {
        Node head=new Node(0);
        Node p=head;
        for (int i = 1; i <8 ; i++) {
            p.next=new Node(i);
            p=p.next;
        }

       head= removeLastKthNode2(head,3);
       while (head!=null){
           System.out.print(head.value+" ");
           head=head.next;
       }
    }
}
