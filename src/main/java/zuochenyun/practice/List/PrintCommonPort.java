package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/8 14:54
 */
public class PrintCommonPort {
    public void printListBySort(Node head1,Node head2){
        Node p1=head1;
        Node p2=head2;
        while (p1!=null&&p2!=null){
            if(p1.value<p2.value){
                System.out.println(p1.value+" ");
                p1=p1.next;
            }else if(p1.value>p2.value) {
                System.out.println(p2.value+" ");
                p2=p2.next;
            }else {
                System.out.print(p1.value+" ");
                p1=p1.next;
                p2=p2.next;
            }
        }

         p1=p1==null?p2:p1;

        while (p1!=null){
            System.out.println(p1.value+" ");
            p1=p1.next;
        }

    }
    public void printCommonPort(Node head1,Node head2){
        Node p1=head1;
        Node p2=head2;
        while (p1!=null&&p2!=null){
            if(p1.value<p2.value){

                p1=p1.next;
            }else if(p1.value>p2.value){
                p2=p2.next;
            }else {
                System.out.print(p1.value+" ");
                p1=p1.next;
                p2=p2.next;
            }
        }



    }
}
