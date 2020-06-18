package com.jz.ch3.t17;

import com.jz.ch3.ListNode;

public class MergeList {
    public ListNode merge(ListNode list1,ListNode list2){

        ListNode mergeList=null;
        ListNode mergeHead =mergeList;
        if(list1==null) return list2;
        else if(list2==null) return list1;
        if(list1.val<=list2.val) {
            mergeList=list1;
            list1=list1.next;
        }

        else {
            mergeList=list2;
            list2=list2.next;
        }
        while (list1!=null&&list2!=null){
            if(list1.val<=list2.val) {
                mergeList.next=list1;
                list1=list1.next;
            } else {
                mergeList.next=list2;
                list2=list2.next;
            }
            mergeList=mergeList.next;

        }
        if(list1==null){
            mergeList.next=list2;
        }else mergeList.next=list1;
        return mergeHead;
    }


    public ListNode merge2(ListNode list1,ListNode list2){
        ListNode mergeHead =null;
        if(list1==null) return list2;
        else if(list2==null) return list1;
        if(list1.val<=list2.val){
            mergeHead=list1;
           mergeHead.next= merge2(list1.next,list2);
        }else {
            mergeHead=list2;
           mergeHead.next= merge2(list1,list2.next);
        }
        return mergeHead;
    }
}
