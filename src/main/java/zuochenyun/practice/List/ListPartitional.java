package zuochenyun.practice.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/10 15:03
 */
public class ListPartitional {
    //通过数组
    public Node listPartitionalByArry(Node head,int pivot){
        if(head==null)
            return head;
        Node cur=head;
        int len=0;
        while (cur!=null){
            len++;
            cur=cur.next;
        }

        Node[] arr=new Node[len];
        cur=head;
        int i=0;
        while (cur!=null){
            arr[i++]=cur;
            cur=cur.next;
        }


        partion(arr,pivot);
        int j = 1;
        for (; j <arr.length ; j++) {
             arr[j-1].next=arr[j];
        }
        arr[j-1].next=null;
        return arr[0];

    }

    private void partion(Node[] arr, int pivot) {
        int right=arr.length;
        int left=-1;
        int index=0;
        while (index!=right){
            if(arr[index].value<pivot)
                swap(arr,index++,++left);
            else if(arr[index].value>pivot){
                swap(arr,index,--right);
            }else index++;
        }
    }

    private void swap(Node[] arr, int a, int b) {
        Node tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }

    public Node listPartitionalByArry1(Node head,int pivot){
        Node sH=null;
        Node sT=null;
        Node eH=null;
        Node eT=null;
        Node bH=null;
        Node bT=null;

        Node cur=head;
        Node next=null;
        while (cur!=null){
            next=cur.next;
            cur.next=null;
            if(cur.value<pivot){
                if(sH==null){
                    sH=cur;
                    sT=cur;
                }else {
                    sT.next=cur;
                    sT=cur;
                }
            }else if(cur.value==pivot){
                if(eH==null){
                    eH=cur;
                    eT=cur;
                }else {
                    eT.next=cur;
                    eT=cur;
                }
                }else {
                if(bH==null){
                    bH=cur;
                    bT=cur;
                }else {
                    bT.next=cur;
                    bT=cur;
                }
            }
            cur=next;
        }

        if(sT!=null){
            sT.next=eH;
            eT=eT==null?sT:eT;
        }

        if(bH!=null){
            eT.next=bH;
        }

        return sH!=null?sH:eH!=null?eH:bH;

    }
}
