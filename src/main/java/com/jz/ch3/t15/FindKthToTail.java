package com.jz.ch3.t15;

public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    public ListNode FindKthToTail(ListNode head,int k) {

            if(head==null) return null;
            if(k==0) return null;
            ListNode pHead=head;
            ListNode pK=head;
        for (int i = 0; i <k ; i++) {
            pK=pK.next;
            if(pK==null){
                return  null; //链表长度小于k
            }
        }
        while (pK.next!=null){
            pK=pK.next;
            pHead=pHead.next;
        }

        return pHead;


    }

    }
}
