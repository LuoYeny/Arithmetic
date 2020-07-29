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
        for (int i = 1; i <8 ; i++) {
            node.next=new Node(i);
            node=node.next;
        }
       Node newhead= new KReverse().solution(head,4);
        while (newhead!=null){
            System.out.print (newhead.value+" ");
            newhead=newhead.next;
        }
    }


    public static Node  solution(Node head,int k){
        if(k<2)
            return head;
        Node left=null;
        Node pre =null;
        Node node =head;
        Node right=null;
        int count=0;
        while(node!=null){
            count++;
            right=node.next;
            while(count==k){
                pre =left==null?head:left.next;   //pre的设置需要放在head的设置之前
                head=left==null?node:head;

                reverse(left,pre,node,right);
                left=pre;
                count=0;
            }
            node=right;
        }
        return head;
    }



    private static void reverse(Node left, Node start, Node end, Node right) {

        Node pre =start;
        Node cur =start.next;
        Node next =null;
        while(cur!=right){
            next =cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        if(left!=null)
            left.next=end;
        start.next=right;
    }










    private void reverse2(Node left, Node start, Node end, Node right) {

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
