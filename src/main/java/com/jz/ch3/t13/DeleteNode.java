package com.jz.ch3.t13;

public class DeleteNode {

        public class ListNode {
             int val;
             ListNode next = null;

             ListNode(int val) {
                this.val = val;
             }
        }

        public void deleteNode(ListNode head,ListNode deleteNode){



               //要删除的结点不在链表尾部
            if(deleteNode.next!=null){
                ListNode deleteNodeNext=deleteNode.next;
                deleteNode.val=deleteNodeNext.val;
                deleteNode.next=deleteNodeNext.next;
            //链表只有一个节点
            }else if(deleteNode==head){
                head=null;
            }
            //要删除的节点在尾部
            else {
               if (deleteNode.next==null){
                    ListNode pre =head;
                    ListNode current=head.next;
                    while (current!=null){
                        if(current==deleteNode){
                            pre=current.next;
                        }
                        current=current.next;
                        pre=pre.next;
                    }
                }
            }
        }


}
