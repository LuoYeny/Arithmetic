package zuochenyun.binaryTree;

import java.util.HashMap;

public class GetMaxLength {
    public int getMaxLength(Node head,int sum){
        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();
        hashMap.put(0,0);
        int curSum=0;
        int maxLen=0;
          maxLen =solution(hashMap,sum,0,1,head,maxLen);
          return maxLen;
    }

    private int solution(HashMap<Integer, Integer> hashMap, int sum,int preSum,int level ,Node head,  int maxLen) {
        if(head==null)return maxLen;
       int curSum=preSum+head.value;
        if(!hashMap.containsKey(curSum))
            hashMap.put(curSum,level);

        if(hashMap.containsKey(curSum-sum))
            maxLen=Math.max(maxLen,level-hashMap.get(curSum-sum));

        maxLen=solution(hashMap,sum,curSum,level+1,head.left,maxLen);
        maxLen=solution(hashMap,sum,curSum,level+1,head.right,maxLen);
        if(level==hashMap.get(curSum))
            hashMap.remove(curSum);

        return maxLen;
    }
}
