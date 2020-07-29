package enterprise.zj;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/17 15:36
 */
public class TopKByHeap {

    public static void print(int[]heap ){
        for (int j = 0; j <heap.length ; j++) {
            System.out.print (heap[j]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int k=5;
        int[] arr ={4,4,45,5,3,8, 24,1,4,2,54,0};
        int[] heap =new int[k];

        for ( int i=0; i <k ; i++) {
            heapInsert(heap,arr[i],i);
        }
        print(heap);
        for(int i=k;i<arr.length;i++){
            if(arr[i]<heap[0]){
                heap[0]=arr[i];
                heapfy(heap,0,k);
            }

            System.out.println(i+"  :");
            print(heap);


        }
        System.out.println("==========================");
        print(heap);
    }

    private static void heapfy(int[] heap, int index,int heapSize) {
        int bigestIndex =index;
        int left=2*index+1;
        int right=2*index+2;
        while (left<heapSize){
            if(heap[left]>heap[index]){
                bigestIndex=left;
            }
            if(right<heapSize&&heap[right]>heap[bigestIndex]){
                bigestIndex=right;
            }
            if(bigestIndex!=index)
            swap(heap,bigestIndex,index);
            else break;

            index=bigestIndex;
            left=2*index+1;
            right=2*index+2;
        }
    }

    private static void heapInsert(int[] heap, int value, int index) {
        heap[index]=value;   //先插入
         while (index!=0){
             int parent =(index-1)/2;
             if(heap[parent]<heap[index]){  //大顶堆
                 swap(heap,parent,index);
                 index=parent;
             }else break;

         }
    }


    private static void swap(int[] arr, int i, int j) {
        int tmp =arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
