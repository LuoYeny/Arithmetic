package enterprise.zj.LRU;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/19 18:47
 */

public class DoubleList {
    private Node tail=null;
    private Node head=null;
    private int size=0;
    // 在链表头部添加节点 x，时间 O(1)
    public void addFirst(Node x){
        if(head==null){
            head=x;
            tail=x;
        }else {
            x.next=head;
            head.prev=x;
            head=x;

        }
        size++;
    }

    // 删除链表中的 x 节点（x 一定存在）
    // 由于是双链表且给的是目标 Node 节点，时间 O(1)
    public void remove(Node x){
        if(x.prev==null){
           removeFirst();

        }else if(x.next==null){
            removeLast();

        }else {
            x.prev.next=x.next;
            x.next.prev=x.prev;
            size--;
        }




    }
    public Node removeFirst( ){
        if (size == 0) {
            return null;
        } else if (size == 1) {
            Node firstNode = head;
            head = null;
            tail = null;
            size--;
            return firstNode;
        } else {
            Node firstNode = head;
            head=head.next;
            head.prev=null;
            size--;

            return firstNode;
        }
    }

    // 删除链表中最后一个节点，并返回该节点，时间 O(1)
    public Node removeLast(){
             if (size == 0) {
                 return null;
             } else if (size == 1) {
                 Node lastNode = tail;
                 head = null;
                 tail = null;
                 size--;
                 return lastNode;
             } else {
                 Node lastNode = tail;
                 tail = tail.prev;
                 tail.next = null;
                 lastNode.prev = null;
                 size--;

                 return lastNode;
             }


    }


    // 返回链表长度，时间 O(1)
    public int size(){
         return size;
    }


}
