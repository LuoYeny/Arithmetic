package com.jz.ch4.t26;

public class Clone {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }

    }

    public RandomListNode Clone(RandomListNode pHead) {
        if(pHead==null)
            return null;
        RandomListNode oldCur=pHead;
     //第一步 ：把新结点连接到链表每个结点后面
        while (oldCur!=null){
            RandomListNode newNode= new RandomListNode(oldCur.label);
            newNode.next=oldCur.next;
            oldCur.next=newNode;
            oldCur=newNode.next;
        }
        //第二步 ： 给random赋值
        RandomListNode mixCur=pHead;

        while (mixCur!=null){
            RandomListNode mixCurNext=mixCur.next;
            if(mixCur.random==null)
                mixCurNext.random=null;

            else mixCurNext.random=mixCur.random.next;

            mixCur=mixCurNext.next;


        }

        //第三步：把链表分开

        RandomListNode s=new RandomListNode(0);
        RandomListNode s1=s;
        while(pHead!=null){
            RandomListNode  q=pHead.next;
            pHead.next=q.next;
            q.next=s.next;
            s.next=q;
            s=s.next;
            pHead=pHead.next;


        }
        return s1.next;
    }
}
