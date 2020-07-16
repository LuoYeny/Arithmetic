package zuochenyun.dynamicPlanning;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 17:42
 */
//最长递增子序列
public class GenerateLIS {
    public List<Integer> lastedSubList(int[] arr){
        if(arr.length==0)
            return null;

        List<Integer> array = new ArrayList<>();
        List<Integer> res =solution(arr,0,array,0,0,arr.length);
        return res;
    }

    private List<Integer> solution(int[] arr, int start, List<Integer> array, int maxLen, int curLen, int length) {
        if(start==length||(array.size()>1&&array.get(array.size()-1)<array.get(array.size()-2))){
            if(array.get(array.size()-1)<array.get(array.size()-2)){
                array.remove(array.size()-1);
                curLen=curLen-1;
            }



        }
        for (int i = start; i <length ; i++) {

        }
        return array;
    }


    public static void main(String[] args) {
        int[] arr= {2,1,5,3,6,4,8,9,7};
        int[] arr1= {2,1,5,3,6,4,8,9,7};
        System.out.println(new GenerateLIS().lastedSubList(arr));
    }
}
