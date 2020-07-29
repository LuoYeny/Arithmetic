package enterprise.zj;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/17 16:40
 */
//返回最大的前k个数
    //构造小顶堆，不断的把最小的替换出来
public class TopKByHeap1 {

    public static void main(String[] args) {
            int[] arr ={2,4,5,1,8,7,9,9,5};
            solution(arr,5);
    }
    public static void print(int[]heap ){
        for (int j = 0; j <heap.length ; j++) {
            System.out.print (heap[j]+" ");
        }
        System.out.println();
    }
    public static void solution(int[] arr,int k){
        int[] heap = new int[k];

        for (int i = 0; i <k ; i++) {
            insertHeap(heap,arr[i],i);
        }

        for (int i = k; i <arr.length ; i++) {
            if(arr[i]>heap[0]){
                heap[0]=arr[i];
                heapfy(heap,0,k);
            }
        }
        print(heap);
    }

    private static void heapfy(int[] heap, int index, int heapSize) {
        int minIndex=index;
        int left =2*index+1;
        int right=2*index+2;

        while (left<heapSize){
            if(heap[left]<heap[index]){
                 minIndex=left;
            }
            if(right<heapSize&&heap[right]<heap[minIndex]){
                minIndex=right;
            }

            if(index!=minIndex){
                swap(heap,index,minIndex);
            }else break;
            index=minIndex;
              left =2*index+1;
             right=2*index+2;
        }
    }

    private static void insertHeap(int[] heap, int value, int index) {
        heap[index]=value;
        while (index!=0){  //新插入的不断和父节点比较
            int parent =(index-1)/2;
            if(heap[parent]>heap[index]){
                swap(heap,parent,index);
                index=parent;
            }else break;
        }
    }

    private static void swap(int[] heap, int i, int j) {
        int tmp=heap[i];
        heap[i]=heap[j];
        heap[j]=tmp;
    }
}
