package com.jz.ch2.t5;

//自己创建一个链表
public class LinkedList<E> {

//创建节点
    class Node{
        public E e ;
        public Node next;

    public Node(E e, Node next) {
        this.e = e;
        this.next = next;
    }
    public Node (E e){
        this(e,null);
    }
    public Node(){
        this(null,null);
    }



}

    //操作链表
    private Node head;
    private int size;

    public LinkedList() {
        head =null;
         size=0;
    }
    public void addFirst(E e){
        Node newNode = new Node (e);
        head =newNode;
         size++;
    }
    public void add(E e,int index){
       if(index<0||index>size){
           throw new IllegalArgumentException("Add failed. Illegal index.");
       }
       if (index==0)
           addFirst(e);


      else{
           Node pre=head;
           for (int i = 0; i <index-1 ; i++) {
               pre=pre.next;

           }
           pre.next = new Node(e, pre.next);
           size ++;
       }

    }
    public void addLast(E e){
        add(  e,size);
    }
}
