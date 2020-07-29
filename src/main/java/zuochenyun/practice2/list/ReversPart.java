package zuochenyun.practice2.list;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/21 14:57
 */
//翻转部分链表
public class ReversPart {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        int m= sc.nextInt();
        Node node =new Node(1);
        Node head=node;
        for(int i=2;i<6 ;i++){
            node.next =new Node(i);
            node=node.next;
        }
//        int from= sc.nextInt();
//        int to= sc.nextInt();
        System.out.println("start ...");
        head=solution(head,1,3);
        while(head!=null){
            System.out.print(head.value+" ");
            head=head.next;
        }
    }
    public static Node solution(Node head,int from,int to){
        if(head==null )
            return head;
        Node cur =head;
        Node left= null;
        Node right=null;
        Node start= null;
        Node end =null;
        while(cur!=null){
           -- to;
            --from;
            left =from==1?cur:left;
            start=from==0?cur:start;
            end=to==0?cur:end;
            System.out.println("to "+to);
            cur=cur.next;

        }
        System.out.println("start "+start.value);
        System.out.println("end  "+end.value);
        right=end.next;
        Node newHead= left==null?end:head;
        reverse(left,start,end,right);

        return newHead;

    }
    public static void reverse(Node left,Node start,Node end,Node right ){
        if(left!=null)
            left.next=end;

        Node cur=start.next;
        Node pre=start;
        Node next=null;
        while(cur!=right){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }

        start.next=right;
    }
}
