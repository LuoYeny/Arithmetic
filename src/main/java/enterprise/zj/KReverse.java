package enterprise.zj;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/16 16:27
 */


public class KReverse {

    public static void main(String[] args) {
        Node node = new Node(0);
        Node head=node;
        for (int i = 1; i <5 ; i++) {
            node.next=new Node(i);
            node=node.next;
        }
       Node newhead= new KReverse().solution(head,2);
        while (newhead!=null){
            System.out.print (newhead.value+" ");
            newhead=newhead.next;
        }
    }

    public Node solution(Node head,int k){
        Node pre =null;
        Node right=null;
        Node left =null;
        int count =0;
        Node node =head ;


        while (node!=null){
            count++;
            right=node.next;
            if(count==k){
                pre=left==null?head:left.next;
                head=left==null?node:head;
                reverse(left,pre,node,right);
              left=pre;
              count=0;
            }

            node=right;
        }

        return head;
    }

    private void reverse1(Node left, Node start, Node end, Node right) {

            Node next=null;

            Node pre =start;
            Node cur =start.next;
            while (cur!=right){
                next =cur.next;
                cur.next=pre;
                pre=cur;
                cur=next;
            }
            start.next=right;


            //pre.next=right;
            if(left!=null){
                left.next=end;
            }


    }
    private void reverse(Node left, Node start, Node end, Node right) {

        Node next=null;

        Node pre =start;
        Node cur =start.next;
        while (cur!=right){
            next =cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        start.next=right;


        //pre.next=right;
        if(left!=null){
            left.next=end;
        }


    }
}
