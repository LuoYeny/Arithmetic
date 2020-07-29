package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/21 16:34
 */
//添加最小的字符把字符串转换为回文字符串
public class GetPalindrome {

    public static void main(String[] args) {
        System.out.println(new GetPalindrome().getpalindrome("aaab"));
    }
    public String getpalindrome(String str){
        if(str==null||str.length()==0)
            return null;

        char[] chars=str.toCharArray();
        int[][]dp=getDp(chars);
        char[] res= new char [dp[0][dp[0].length-1]+chars.length];
        int l=0;
        int r=chars.length-1;
        int resl=0;
        int resr=res.length-1;
        while (l<=r){
            if(chars[l]==chars[r]){
                res[resl++]=chars[l++];
                res[resr--]=chars[r--];
            }else if(dp[l+1][r]<dp[l][r-1]){

                res[resl++]=chars[l];
                res[resr--]=chars[l++];
            }else {
                res[resl++]=chars[r];
                res[resr--]=chars[r--];
            }

        }

        return String.valueOf(res);
    }


    public int[][] getDp(char[] arr){

        int[][]dp=new int[arr.length][arr.length];

        for (int j = 1; j <arr.length ; j++) {
            dp[j-1][j] =arr[j]==arr[j-1]?0:1;

            for (int i = j-2; i >=0 ; i--) {
                if(arr[j]==arr[i]){
                    dp[i][j]=dp[i+1][j-1];
                }else {
                    dp[i][j]=Math.min(dp[i][j-1],dp[i+1][j])+1;
                }
            }

        }

        return dp;
    }
}
