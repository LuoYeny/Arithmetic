package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/8 17:36
 */
public class JosephusKill {
    public Node josephusKill(Node head,int m){
        if(m<1||head==null||head.next==head)
            return head;

        Node pre=head;
        while (pre.next!=head){
            pre=pre.next;
        }

        int count=0;
        while (head!=pre){
            count++;
            if(count==m){
                pre.next=head.next;

                count=0;
            }else {

                pre=pre.next;
            }
            head=pre.next;
        }
        return head;

    }
}
