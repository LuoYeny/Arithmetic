package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/6 16:58
 */
//最长的有效子括号
public class MaxBracketsLength {
    public int maxBracketLength(String str){
        char[] chars=str.toCharArray();
        int[] dp = new int[chars.length];
         int pre =0;
         int res= 0;

        for (int i = 1; i < chars.length; i++) {
            if(chars[i]==')'){
                pre=i-dp[i-1]-1;
                if(pre>=0&&chars[pre]=='(' ){
                    dp[i]=dp[i-1]+2+(pre>0?dp[pre-1]:0);
                }
            }
            res=Math.max(res,dp[i]);

        }

                return  res;
    }


    public static void main(String[] args) {
        System.out.println(new MaxBracketsLength().maxBracketLength("(()))()(("));
    }
}
