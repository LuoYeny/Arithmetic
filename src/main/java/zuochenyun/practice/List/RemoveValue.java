package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/14 15:26
 */
public class RemoveValue {
    public Node removeValue(Node head,int value){
        if(head==null)
            return head;

        Node cur=head;
        Node newHead=null;
        while (cur.value==value){
            newHead=cur.next;
            cur=cur.next;
        }

        cur=newHead;
        Node pre=newHead;
        while (cur!=null){
            if(cur.value==value)
                pre.next=cur.next;
            else pre=cur;
            cur=cur.next;
        }

        return newHead;
    }
}
