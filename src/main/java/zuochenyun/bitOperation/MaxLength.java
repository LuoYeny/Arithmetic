package zuochenyun.bitOperation;

import java.util.HashMap;
import java.util.Map;

public class MaxLength {
    public int  maxLength(int[] arr,int k){
        if(arr.length==0||k<=0||arr==null)
            return 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int sum=0;
        int len=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                len=Math.max(len,i-map.get(sum-k));
            }
            if(!map.containsKey(sum))
                map.put(sum,i);

        }
        return len;
    }
}
