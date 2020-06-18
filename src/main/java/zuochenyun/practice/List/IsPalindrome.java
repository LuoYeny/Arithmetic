package zuochenyun.practice.List;

import java.util.Stack;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/9 16:36
 */
public class IsPalindrome {
    public boolean idPalindrome(Node head){
        //找到链表的中点
        if(head==null||head.next==null)
            return false;
        Node midNode=null;
        if(head.next.next==null)
            midNode=head.next;
        Node pre=head;
        Node after=head.next.next;
        while (after.next!=null&&after.next.next!=null){
            after=after.next.next;
            pre=pre.next;

        }
        System.out.println(pre.value);
        midNode=pre.next;

        Stack<Node> stack=new Stack<>();
        Node last =midNode.next;
        while (last!=null){
            stack.push(last);
           last=last.next;
        }


        while (!stack.isEmpty()&&stack.peek().value==head.value){
            System.out.println("stack.peek().value "+stack.peek().value);
            System.out.println("head.value "+head.value);
            head=head.next;
            stack.pop();
        }




        return stack.isEmpty();

    }
    public boolean idPalindrome1(Node head){
        //找到链表的中点
        if(head==null||head.next==null)
            return false;
        Node midNode=null;
        if(head.next.next==null)
            midNode=head.next;
        Node first=head;
        Node last=head.next.next;
        while (last.next!=null&&last.next.next!=null){
            last=last.next.next;
            first=first.next;

        }

        midNode=first.next;
        Node pre =null;
        Node next=null;
        Node cur=midNode.next;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;

        }

        midNode.next=pre;
        cur=head;
        while (pre!=null){
            pre=pre.next;
            cur=cur.next;
        }
        boolean flag=pre==null;


          pre =null;
          next=null;
          cur=midNode.next;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;

        }
        midNode.next=pre;

        return flag;


    }
}
