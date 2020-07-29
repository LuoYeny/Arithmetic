package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/13 17:09
 */
//最长无重复子串
public class MaxUnique {
    public static void main(String[] args) {
       String s="qqdddrrgfag";
       int res = solution(s);
        System.out.println(res);
    }

    private static int solution(String s) {

        char[] chars =s.toCharArray();
        int[] map = new int[256];
        //int[] map1 = new int[2569999] ;
        //传入的是字符串数组 整数n（1≤n≤10^5)
        for (int i = 0; i <map.length ; i++) {
            map[i]=-1;
        }
        int pre=-1;
        int len=0;
        int cur=0;
        for (int i = 0; i<chars.length ; i++) {
            pre=Math.max(pre,map[chars[i]]);
            cur=i-pre;
            len=Math.max(cur,len);
            map[chars[i]]=i;
        }

        return len;
    }
}
