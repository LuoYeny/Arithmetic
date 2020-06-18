package mine.recursion.list;

public class InversionList {
   public static class Node{
        int data;
        Node next=null;

       public Node(int data) {
           this.data = data;
       }
   }

    public static void main(String[] args) {
       Node head= new Node(0);
       Node pHead=head;
        for (int i = 0; i <5 ; i++) {
            Node newNode= new Node(i);
            head.next=newNode;
            head=head.next;
        }

        Node rel = solution(pHead);
    }

    private static Node solution(Node pHead) {

       if(pHead.next==null||pHead==null)
           return pHead;
     Node newList=  solution(pHead.next);
      Node pCur= pHead.next;
      pHead.next=null;
      pCur.next=pHead;



     return newList;



    }
}
