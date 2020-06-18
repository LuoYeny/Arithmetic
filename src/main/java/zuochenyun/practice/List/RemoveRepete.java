package zuochenyun.practice.List;

import java.util.HashSet;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/14 15:00
 */
public class RemoveRepete {
    public Node removeRepete1(Node head){
        if(head==null)
            return head;
        HashSet<Integer> set = new HashSet<>();

        Node pre =head;
        Node cur=head.next;
        set.add(cur.value);
        while (cur!=null){
            if(set.contains(cur.value)){
                 pre.next=cur.next;
            }else {
                set.add(cur.value);
                pre=cur;
            }


            cur=cur.next;
        }
        return head;
    }




    public Node removeRepete2(Node head){
        if(head==null)
            return head;
    Node pre =null;
    Node cur= head;
    Node next=null;

    while (cur!=null){
        pre=cur;
        next=cur.next;
        while (next!=null){
            if(cur.value==next.value){
                pre.next=next.next;
            }else {
                pre=pre.next;
            }
            next=next.next;
        }
        cur=cur.next;
    }

    return head;

    }
}
