package zuochenyun.practice.matrix;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 15:15
 */
//找到数组中大于一半的数
public class PrintHalfOfMajor {
    public static void main(String[] args) {
        int[] arr= {1,2,3,0,4,3,3,3,3};
        int res = solution(arr);
        System.out.println(res);
    }

    private static int solution(int[] arr) {
        int times=1;
        int tmp=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]==tmp){
                times++;
            }else {
                times--;
                if(times==0){
                    tmp=arr[i];
                    times=1;
                }
            }
        }
        if(times==0)
            return -1;
      int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==tmp){
                index++;
            }
        }

        if(index<(arr.length/2))
            return -1;

        return tmp;
    }
}
