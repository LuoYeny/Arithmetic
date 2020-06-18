package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/15 14:49
 */
public class InsertCircle {
    public Node insertNum(Node head,int num){
        Node node = new Node(num);
        if(head==null){
            node.next=node;
            return node;
        }

        Node pre =head;
        Node cur =head.next;
        while (cur!=head){
            if(cur.value>=node.value&&pre.value<=node.value){

                break;
            }
            cur=cur.next;
            pre=pre.next;
        }


            node.next=cur;
            pre.next=node;


          return head.value<=node.value?head:node;
    }
}
