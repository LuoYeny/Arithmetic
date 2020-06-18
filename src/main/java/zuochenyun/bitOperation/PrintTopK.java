package zuochenyun.bitOperation;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/3 16:23
 */
public class PrintTopK {
    public class HeapNode{
        public int value;//值是多少
        public int arr;//来自什么数组
        public int index;//数组中的位置

        public HeapNode(int value, int arr, int index) {
            this.value = value;
            this.arr = arr;
            this.index = index;
        }
    }

    public void printTopK(int[][] matrix,int topK ){
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return;
        HeapNode[] heap=new HeapNode[matrix.length];
        //构造最大堆
        for (int i = 0; i <matrix.length ; i++) {
            int index=matrix[i].length-1;
            HeapNode heapNode=new HeapNode(matrix[i][index],i,index);
            heap[i]=heapNode;
            heapInsert(heap,i);
            
        }
        int heapSize=matrix.length;
        System.out.println("TOP"+topK+": ");
        for (int i = 0; i <=topK ; i++) {
            if(heapSize==0)
                break;
            System.out.print(heap[0].value+"  ");
            //堆顶替换
            if(heap[0].index!=0){
                heap[0].value=matrix[heap[0].arr][--heap[0].index];
            }else {
                swap(heap,0,--heapSize);
            }
            heapify(heap,0,heapSize);

        }

    }

    private void heapify(HeapNode[] heap, int index, int heapSize) {
        int left=index*2+1;
        int right=index*2+2;
        int largIndex=index;
        while (left<heapSize){

            if(heap[left].value>heap[index].value)
                largIndex=left;
            if(right<heapSize&&heap[right].value>heap[largIndex].value)
                largIndex=right;

            if(index!=largIndex)
                swap(heap,index,largIndex);
            else break;
            index=largIndex;
             left=index*2+1;
              right=index*2+2;
        }
    }

    private void heapInsert(HeapNode[] heap, int index) {
        while (index!=0){
            int parent=(index-1)/2;
            if(heap[parent].value<heap[index].value){
                swap(heap,parent,index);
                index=parent;
            }else break;

        }

    }

    private void swap(HeapNode[] heap, int parent, int index) {
        HeapNode tmp=heap[parent];
        heap[parent]=heap[index];
        heap[index]=tmp;


    }

    public static void main(String[] args) {
        PrintTopK printTopK=new PrintTopK();
        int[][] arr={{4,7,8},{1,2,9},{2,5,6},{10,11}};
        printTopK.printTopK(arr,5);
    }
}
