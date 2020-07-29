package zuochenyun.practice2.list;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/25 14:41
 */
//复制含有随机节点的链表
public class CopyListWithRand {
    public static void main(String[] args) {

    }

    public static RandNode copyMethed(RandNode head){
        if(head==null)
            return null;

        Map<RandNode,RandNode> map = new HashMap<>();
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
       return map.get(head);





    }
}
