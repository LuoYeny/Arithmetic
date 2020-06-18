package com.jz.ch2.t5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ThreadPoolExecutor;

//利用栈倒置输出（略）
//利用递归
public class ReverseOutput {
      class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public  ArrayList<Integer> list = new ArrayList<Integer>();

    public   ArrayList<Integer> output(ListNode listNode ) {

            if(listNode!=null){
                output(listNode.next);
                list.add(listNode.val);
            }

          return list;

    }

}
