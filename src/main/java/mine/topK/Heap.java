package mine.topK;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/6 21:39
 */
//时间复杂度：O(n*lg(k))
public class Heap {
    public void topK(int[] arr,int k){
        int[] heap=new int[k];
        for (int i = 0; i <k ; i++) {
            heap[i]=arr[i];
            heapInsert(heap,i);
        }
        for (int i = 0; i <heap.length ; i++) {
            System.out.print (heap[i]+"  ");
        }
        System.out.println();
        for (int i = k; i <arr.length ; i++) {
            if(arr[k]>heap[0]){
                heap[0]=arr[i];
                heapify(heap,0,k);
            }

        }
        for (int i = 0; i <heap.length ; i++) {
            System.out.print (heap[i]+"  ");
        }
    }
    private void heapInsert(int[] heap, int index) {
        while (index!=0){
            int parent=(index-1)/2;
            if(heap[parent] >heap[index] ){
                swap(heap,parent,index);
                index=parent;
            }else break;

        }

    }
    private void heapify(int[] heap, int index, int heapSize) {
        int left=index*2+1;
        int right=index*2+2;
        int minIndex=index;
        while (left<heapSize){

            if(heap[left]<heap[index])
                minIndex=left;
            if(right<heapSize&&heap[right]<heap[minIndex])
                minIndex=right;

            if(index!=minIndex)
                swap(heap,index,minIndex);
            else break;
            index=minIndex;
            left=index*2+1;
            right=index*2+2;
        }

    }
    private void swap(int[] heap, int parent, int index) {
        int tmp=heap[parent];
        heap[parent]=heap[index];
        heap[index]=tmp;

    }

    public static void main(String[] args) {
        Heap heap= new Heap();
        int[] a={2,3,4,5,6,7,8,11,2,3,4,22};
        heap.topK(a,5);
    }
}
