package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/8 16:36
 */
public class ReversePart {
    public Node reversePart(Node head,int from,int to){
        int len=0;
        Node node1=head;
        Node fpre=null;
        Node tpos=null;

        while (node1!=null){
            len++;
            fpre=len==from-1?node1:fpre;
            tpos=len==to+1?node1:tpos;
            node1=node1.next;
        }
        if(from>to||from<1||to>len)
            return head;
        node1=fpre==null?head:fpre.next;

        node1.next=tpos; //翻转后的尾节点和后面的节点相连
        Node node2=node1.next;
        Node next=null;
        while (node2!=tpos){
            next=node2.next;
            node2.next=node1;
            node1=node2;
            node2=next;
        }
        if(fpre!=null){
            fpre.next=node1;//如果不是从头节点开始翻转，就把前面的节点接上翻转后的头结点
                             //并且返回head
            return head;
        }
        return node1; //不然翻转后的头节点就是链表的头节点



    }



    public Node reversePart1(Node head,int from,int to){

        Node cur=head;
        Node end=head;
        int index=from-1;
        while (--index>0)
            cur=cur.next;  //from前一个
        index=to;
        while (index-->0)
            end=end.next;  //to后一个

        Node last=cur;
        Node pre=cur;
        Node next=null;
        cur=cur.next;
        Node first=cur;

        while (cur!=end){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;

        }

        last.next=pre;
        first.next=end;

        return head;
    }
}
