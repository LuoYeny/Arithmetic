package zuochenyun.practice2.list;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/25 20:30
 */
public class ReverseTreeToList {
    public static void main(String[] args) {

    }

    public static DoubleNode reverse(DoubleNode head){
        if(head==null)
            return null;
        DoubleNode leftE=reverse(head.last);
        DoubleNode rightE= reverse(head.next);
        DoubleNode leftS=leftE==null?null:leftE.last;
        DoubleNode rightS=rightE==null?null:rightE.last;

        if(leftE!=null&&rightE!=null){
            head.last=leftE;
            head.next=rightS;
            leftE.next=head;
            rightS.last=head;
            rightE.next=leftS;
            return rightE;
        }else if(rightE!=null){
            head.next=rightS;
            rightS.last=head;
            rightE.next=head;
            return rightE;

        }else if(leftE!=null){
            leftE.next=head;
            head.last=leftE;
            head.next=leftS;
            return head;
        }else {
            head.next=head;
            return head;
        }


    }
}
