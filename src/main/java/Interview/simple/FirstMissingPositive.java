package Interview.simple;

import java.util.Arrays;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 10:27
 */
//缺失的最小整数 LeetCode
public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] a={0,1,1,2};
        new FirstMissingPositive().firstMissingPositive(a);
    }
    public int firstMissingPositive (int[] A) {
        // write code here
        Arrays.sort(A);

        int i=0;
        for(;i<A.length;i++){
            if(A[i]>0){
                break;
            }
        }


        int index=1;
        for( ;i<A.length;i++){
            System.out.println("i "+i );
            if(i==0&&index==A[i]){
                index++;
            } else  if(i>0&&(index==A[i]||A[i]==A[i-1])) {
                index=i>0&&A[i]==A[i-1]?  index:++index;
                System.out.println(A[i]==A[i-1]);
                System.out.println("index "+index );

            } else break;
        }

        //    if(i==A.length&&A.length!=0)
        //       index++;

        System.out.println(index);
        return index;
    }



    public int firstMissingPositive2(int[] A) {
        if (A == null || A.length == 0)  // 防止越界
            return 1;
        for (int i = 0; i < A.length; i++) {
            //    A[i] - 1 < A.length 超出范围不交换    A[i] != A[A[i] - 1] 相等不交换
            while (A[i] > 0 && A[i] != i + 1 && A[i] - 1 < A.length && A[i] != A[A[i] - 1]) {
                swap(A, i, A[i] - 1);
            }

        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;  // 第一个不相等就返回
            }
        }
        return A[A.length - 1] + 1;  // 数组交换后是有序正数,就返回最大 + 1
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

