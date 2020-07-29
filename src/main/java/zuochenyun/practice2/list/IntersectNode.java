package zuochenyun.practice2.list;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/25 16:00
 */
/**
 * 两链表相交的一系列问题
 * 1.判断链表是否有环
 * 2.无环链表是否相交、求交点
 * 3.有环链表是否相交、在环内部或外部相交、求交点
 */
public class IntersectNode {
    //1.判断链表是否有环，求入环点
    //快慢指针,无环则返回null

    public static Node getLoopNode(Node head){
        if(head==null||head.next==null||head.next.next==null)
            return null;
        Node fast=head.next.next;
        Node slow=head.next;

        while (fast!=slow){
            if(fast.next==null&&fast.next.next==null){
               return null;
            }
            fast=fast.next.next;
            slow=slow.next;
        }

        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }

    //判断两个无环链表是否相交，相交则返回交点
    public static Node noLoop(Node head1,Node head2){
        int len1=0;
        int len2=0;

        Node h1=head1;
        Node h2=head2;
        while (h1.next!=null){
            h1=h1.next;
            len1++;
        }
        while (h2.next!=null){
            h2=h2.next;
            len2++;
        }
        //判断两个链表的最后一个节点
        if(h1!=h2){
            return null;//不相交
        }
        Node cur1=len1-len2>=0?head1:head2;
        Node cur2=len1-len2>=0?head2:head1;
        int i=Math.abs(len1-len2);
        while (i>0){
            cur1=cur1.next;
            i--;
        }

        while (cur1!=cur2){

            cur1=cur1.next;
            cur2=cur2.next;
        }

        return cur1;
    }

    //判断两个有环链表是否相交
    public static Node hasLoop(Node head1,Node loop1,Node head2, Node loop2){
          Node h1=head1;
          Node h2=head2;

        if(loop1==loop2){ //入环前
            int n=0;
            while (h1.next!=loop1){
                h1=h1.next;
                n++;
            }
            while (h2.next!=loop1){
                h2=h2.next;
                n--;
            }
            h1=n>1?head1:head2;
            h2=h1==head1?head2:head1;
            n=Math.abs(n);
            while (h1!=h2){
                h1=h1.next;
                h2=h2.next;
            }
            return h1;
        }else {
            h1=loop1.next;
            while (h1!=loop1){
              if(h1!=loop2){
                  return loop2;
              }
              h1=h1.next;
            }

            return null; //两个环不相交
        }


    }
}
