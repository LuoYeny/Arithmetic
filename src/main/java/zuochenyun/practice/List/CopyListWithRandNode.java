package zuochenyun.practice.List;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/10 16:11
 */
public class CopyListWithRandNode {
    public RandNode copyListWithRandNode1(RandNode head){
        Map<RandNode,RandNode> map=new HashMap<>();
        RandNode cur=head;
        while (cur!=null){
           map.put(cur,new RandNode(cur.value));
           cur=cur.next;
        }

        cur=head;
        while (cur!=null){
             map.get(cur).next=map.get(cur.next);
             map.get(cur).rand=map.get(cur.rand);
             cur=cur.next;
        }
      return   map.get(head);

    }
    public RandNode copyListWithRandNode2(RandNode head){
        RandNode cur=head;
        RandNode next=null;
        while (cur!=null){
            next=cur.next;
            RandNode randNode= new RandNode(cur.value);
            cur.next=randNode;
            cur=next;
        }
        cur=head;
        while (cur!=null){
            cur.next.rand=cur.rand!=null?cur.rand.next:null;
            cur=cur.next.next;
        }
        cur=head;
        RandNode newHead=cur.next;
        RandNode oldHead=cur;
        cur=cur.next.next;

        while (cur!=null){

            oldHead.next=cur;
            newHead.next=cur.next;
            oldHead=oldHead.next;
            newHead=newHead.next;
            cur=cur.next.next;


        }
        return newHead;
    }
}
