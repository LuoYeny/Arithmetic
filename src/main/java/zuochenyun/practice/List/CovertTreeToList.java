package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/14 16:05
 */
public class CovertTreeToList {

    public DoubleNode covert(DoubleNode head){
        if(head==null)
            return head;
        DoubleNode last =process(head);
        head=last.next;
        last.next=null;
        return head;
    }

    private DoubleNode process(DoubleNode head) {
        if(head==null)
            return head;
        DoubleNode leftE= process(head.last);//尾节点
        DoubleNode rightE=process(head.next);

        DoubleNode leftS=leftE!=null?leftE.next:null;//开始节点
        DoubleNode rightS=rightE!=null?rightE.next:null;


        if(leftS!=null&&rightS!=null){
            leftE.next=head;
            head.last=leftE;
            head.next=rightS;
            rightS.last=head;
            rightE.next=leftS;
            return rightE;
        }else if(rightS!=null){
            leftE.next=head;
            head.last=leftE;
            head.next=leftS;
            return head;

        }else if(leftS!=null){
            head.next=rightS;
            rightS.last=head;
            rightE.next=head;
            return rightE;

        }else {
            head.next=head;
            return head;
        }

    }
}
