package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 16:09
 */
//先排序---堆排序
//再判断
public class IsUnique2 {
    public boolean isUnique2(String str){
        if(str==null)
            return true;
        char[] chars=str.toCharArray();
        heapSort(chars);


        for (int i = 1; i <chars.length ; i++) {
            if(chars[i]==chars[i-1])
                return false;
        }
           return true;
    }
    public static void main(String[] args) {
        System.out.println(new IsUnique2().isUnique2("1977623"));
    }

    private void heapSort(char[] chars) {
        //构造大顶堆
        for (int i = 0; i <chars.length ; i++) {
            heapInsert(chars,i);
        }
       // System.out.println(String.valueOf(chars));
        //排序
        for (int i = chars.length-1; i >0; i--) {
            swap(chars,i,0);
            heapify(chars,0,i);
        }
       // System.out.println(String.valueOf(chars));
    }

    private void heapify(char[] chars, int i, int size) {
        int left=i*2+1;
        int right=i*2+2;
       int laegest =i;
        while (left<size){
            if(chars[i]<chars[left]){
                laegest=left;
            }
            if(right<size&&chars[laegest]<chars[right]){
                laegest=right;
            }

            if(laegest!=i){
                swap(chars,laegest,i);
            }else break;
            i=laegest;
            left = i*2+1;
            right=i*2+2;
        }
    }

    //大顶堆   把i前面的数构成大顶堆
    private void heapInsert(char[] chars, int i) {
        int parent=0;
        while (i!=0){
            parent=(i-1)/2;
            if(chars[parent]<chars[i]){
                swap(chars,parent,i);
                i=parent;
            }else break;;
        }


    }

    private void swap(char[] chars, int parent, int i) {
        char temp=chars[parent];
        chars[parent]=chars[i];
        chars[i]=temp;
    }

}
