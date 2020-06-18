package zuochenyun.bitOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/1 15:58
 */
public class MaxLength1 {
    public int maxLength(int[] arr,int k){
        if(arr==null||arr.length==0)
            return 0;

        int sum=0;
        int len=0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                len=Math.max(len,i-map.get(k-arr[i]));
            }
            if(!map.containsKey(sum))
                map.put(sum,i);


        }
        return len;

    }
}
