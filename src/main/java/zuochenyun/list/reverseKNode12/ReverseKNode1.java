package zuochenyun.list.reverseKNode12;

import java.util.Stack;

public class ReverseKNode1 {
    public Node reversKnode(Node head ,int K){
        if(K<=1)
            return head;
        Stack<Node> stack =new Stack<Node>();
        Node cur=head;
        Node newHead=head;
        Node next=null;
        Node pre=null;
        while (cur!=null){
            next=cur.next;
            stack.push(cur);
            if (stack.size()==K){
                pre =reSignl(stack,pre,next);
                newHead=newHead==head?cur:newHead;//新的头结点

            }
            cur=next;
        }

        return newHead;
    }

    private Node reSignl(Stack<Node> stack, Node pre, Node next) {
        Node cur =stack.pop();
        if(pre!=null)
            pre.next=cur;

        while (!stack.empty()){
            cur.next=stack.pop();
            cur=cur.next;
        }
        cur.next=next;
            return cur;
    }
}
