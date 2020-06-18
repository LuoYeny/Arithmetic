package zuochenyun.practice.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/17 14:57
 */
//只读和的最长路径
public class GetMaxLength {
    public int getMaxLength(TreeNode head,int sum){
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,0);
        int len=solution(head,sum,map,0,1,0);
        return len;

    }

    private int solution(TreeNode cur, int sum, Map<Integer, Integer> map, int len,int level,int preSum) {
        if(cur==null)
            return len;
        int curSum=preSum+cur.val;
        if(!map.containsKey(curSum))
            map.put(curSum,level);

        if(map.containsKey(curSum-sum)){
            len=Math.max((level-map.get(curSum-sum)),len);
        }
       len= solution(cur.left,sum,map,len,level+1,curSum);
        len=solution(cur.right,sum,map,len,level+1,curSum);
        if(level==map.get(curSum))
            map.remove(curSum);
     //   System.out.println("len "+len);
        return len;
    }
}
