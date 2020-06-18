package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/14 16:54
 */
public class SelectSort {
    public Node selectSort(Node head){
        if(head==null)
            return null;
        Node newHead=null;
        Node node=null;
        Node cur=head;
        Node minPre=null;
        Node min=null;
        while (cur!=null){
            minPre=getMinPre(cur);
            if(minPre==null){
                min=cur;
                cur=cur.next;

            }else {
                min=minPre.next;
                minPre.next=min.next;
                min.next=null;

            }
        //    System.out.println("min  "+min.value);
            if(newHead==null){
                newHead=min;
                node=newHead;
            }else {
                newHead.next=min;
                newHead=newHead.next;
            }



        }


       return node;

    }

    public Node getMinPre(Node head){
        if(head==null)
            return null;
        Node cur=head;
        Node next=null;
        Node pre=null;
        Node min=null;
        Node minPre=null;


            min=cur;
            pre=cur;
            next=cur.next;
            while (next!=null){
                if(next.value<min.value){
                    minPre=pre;
                    min=next;
                }
                next=next.next;
                pre=pre.next;

            }




        return minPre;

    }
}
