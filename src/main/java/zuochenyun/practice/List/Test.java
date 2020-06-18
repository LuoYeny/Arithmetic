package zuochenyun.practice.List;

import java.util.Random;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/8 16:11
 */
public class Test {

    public static void main(String[] args) {
        Node head=new Node(0);
        Node head1=new Node(0);
        Node p=head;
        int rand=0;
        for (int i = 1; i <12 ;  ) {
        //    rand= new Random().nextInt(10);
            p.next=new Node(i);
            p=p.next;
            i=i+2;
        }
         p=head1;
        for (int i = 1; i <15 ;  ) {
            //    rand= new Random().nextInt(10);
            p.next=new Node(i);
            p=p.next;
            i=i+1;
        }

//        Node cur=head;
//        while (cur!=null){
//            System.out.print(cur.value+" ");
//            cur=cur.next;
//        }
        Node cur1=head1;
        while (cur1!=null){
            System.out.print(cur1.value+" ");
            cur1=cur1.next;
        }
        //cur=head;
        cur1=head1;

       Node cur2= new Relocate().relocate(cur1);
        System.out.println();

        while (cur2!=null){
            System.out.print(cur2.value+" ");
            cur2=cur2.next;
        }
}


}
