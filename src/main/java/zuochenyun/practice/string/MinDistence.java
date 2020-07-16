package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/2 15:26
 */
//字符串中 求两个字符之间的最小距离
public class MinDistence {
    public int minDistence(String[] str,String str1,String str2){
        if(str1==null||str2==null)
            return -1;

        if(str1.equals(str2)){
            return 0;
        }

        int last1=-1;
        int last2=-1;
        int min=Integer.MAX_VALUE;

        for (int i = 0; i <str.length ; i++) {
            if(str[i].equals(str1)){
                last1=i;
                min=Math.min(min,last2==-1?min:i-last2);
            }
            if(str[i].equals(str2)){
                last2=i;
                min=Math.min(min,last1==-1?min:i-last1);
            }

        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    public static void main(String[] args) {
        String[] strings ={"tyu","jkjk","ii","hhh","h"};
        System.out.println(new MinDistence().minDistence(strings,"ii","h"));
    }
}
