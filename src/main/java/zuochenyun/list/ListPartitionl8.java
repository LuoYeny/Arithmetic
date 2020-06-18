package zuochenyun.list;

import java.util.Arrays;

public class ListPartitionl8 {
    public static class Node {
        int value;
        Node next = null;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node listPartitionl(Node head,int piovt){
        if(head==null){
            return head;
        }
        int len=0;
        Node cur =head;
        while (cur!=null){
            len++;
            cur=cur.next;
        }
      Node[] nodeArray = new Node[len];
        cur =head;
        int i=0;
        while (cur!=null){
             nodeArray[i++]=cur;
             cur=cur.next;
        }

        arrPartition(nodeArray,piovt);
        for (int j = 1; j <nodeArray.length; j++) {
            nodeArray[i-1].next=nodeArray[i];
        }

        nodeArray[i-1].next=null;
        return nodeArray[0];
    }

    private void arrPartition(Node[] nodeArray, int piovt) {
        int start =-1;
        int end=nodeArray.length;
        int index=0;
       while (index!=end){
            if(nodeArray[index].value<piovt)
                swap(nodeArray,++start,index);
            else if(nodeArray[index].value==piovt)
                index++;
            else swap(nodeArray,--end,index);
        }
    }

    private void swap(Node[] nodeArray,int a,int b){
        Node tmp =nodeArray[a];
        nodeArray[a]=nodeArray[b];
        nodeArray[b]=tmp;
    }
}
