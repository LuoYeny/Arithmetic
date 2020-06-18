package com.jz.ch3.t16;

import com.jz.ch3.ListNode;

public class ReverseList {




    public static ListNode ReverseList(ListNode head) {


        ListNode reverseHead=null;
        ListNode pNode=head;
        ListNode pre=null;



        while (pNode!=null){
           ListNode pNext =pNode.next;
           if(pNext==null)
               reverseHead=pNode;
           pNode.next=pre;
           pre=pNode;
           pNode=pNext;
        }
        return reverseHead;

    }
    public static ListNode ReverseListByRecursion(ListNode head){


        if(head==null)
            return null;
        if(head.next==null){

            return head;
        }

        ListNode pNode=null;
        pNode =ReverseListByRecursion(head.next);

        head.next.next=head;
        head.next=null;
        System.out.println(pNode.val);
        return pNode;



    }

    public static void main(String[] args) {
        ListNode listNode =new ListNode(0);
        ListNode head =listNode;

        for (int i = 1; i <=5 ; i++) {
           ListNode myListNode =new ListNode(i);
         //System.out.println("myListNode:"+myListNode.val);
                listNode.next=myListNode;
                listNode=listNode.next;
        }

        ListNode rul=ReverseListByRecursion(head);
        int i=20;
            while (rul!=null&&i>0){
                System.out.println("rul:"+rul.val);
                i--;
                rul=rul.next;

        }

    }
}
