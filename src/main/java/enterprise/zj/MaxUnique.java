package enterprise.zj;

import java.util.Scanner;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/16 14:55
 */
//字符串的无重复子串★★★★★
public class MaxUnique {
    public static void main(String[] args){
        System.out.println(solution("asddsds".toCharArray()));
    }
    public static int solution (char[] arr){
        int[] map= new int[256];
        for(int i=0;i<map.length;i++){
            map[i]=-1;
        }
        int pre =-1;
        int len=0;
        int cur=0;
        for(int i=0;i<arr.length;i++){
            pre=Math.max(pre,map[arr[i]]); //判断现在来的字符的前一个字符的位置是在pre前还是后
            cur=i-pre;//当前长度
            len=Math.max(cur,len);
            map[arr[i]]=i;//把map中的位置更新为最近长度
        }

        return len;
    }
}
