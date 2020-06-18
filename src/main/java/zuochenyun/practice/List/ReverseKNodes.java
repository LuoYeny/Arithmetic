package zuochenyun.practice.List;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/11 16:50
 */
public class ReverseKNodes {
    public Node reverseKNodes(Node head,int k){
        if(head==null||k<=1)
            return head;
        Stack<Node> stack= new Stack<>();
        Node newHead=head;
        Node cur=head;
        Node next=null;
        Node pre=null;
        while (cur!=null){
            next=cur.next;
            cur.next=null;
            stack.push(cur);
            if(stack.size()==k){
               pre= resignl(stack,pre,next);
               newHead=newHead==head?cur:newHead;//第一轮压入的最后一个结点，逆序后的头节点
            }
            cur=next;
        }
        return newHead;
    }
    public Node reverseKNodes2(Node head,int k){
        if(head==null||k<=1)
            return head;
        
        Node newHead=head;
        Node start=head;
        Node cur=head;
        Node next=null;
        Node pre=null;
        int count=1;
        while (cur!=null){
            next=cur.next;
            if(count==k){
                start=pre==null?head:pre.next;
                newHead=pre==null?cur:newHead;
                reverse(pre,start,cur,next);
                pre=start;
                count=0;
            }
            count++;
            
            cur=next;
        }
        return newHead;
    }

    private void reverse(Node left, Node start, Node end, Node right) {
        Node pre =start;
        Node cur=start.next;
        Node next=null;
        while (cur!=right){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        if(left!=null)//翻转后end/pre是头节点
        left.next=end;

         start.next=right;


    }


    private Node resignl(Stack<Node> stack, Node left, Node right) {
        Node cur=stack.pop();
        if(left!=null)
            left.next=cur;  //如果左边不为null 就把左边连上
        Node next=null;
        while (!stack.isEmpty()){
           next=stack.pop();
           cur.next=next;
           cur=next;
        }
        cur.next=right;
        return cur;
    }
}
