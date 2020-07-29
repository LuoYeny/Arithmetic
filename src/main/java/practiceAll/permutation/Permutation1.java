package practiceAll.permutation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/24 14:53
 */
//含有重复的全排
public class Permutation1 {
    public static void main(String[] args) {
        String str ="abbbb";
        char[] chars =str.toCharArray();
        Arrays.sort(chars);
        boolean[] used = new boolean[chars.length];
        StringBuffer tmp = new StringBuffer();
        List<String> list = new LinkedList<>();
        solution(chars,0,chars.length,tmp,list,used);
        System.out.println(list);
    }

    private static void solution(char[] chars, int start, int length, StringBuffer tmp, List<String> list, boolean[] used) {
        if(start==length){
            list.add(tmp.toString());
            return;
        }

        for (int i = 0; i <length ; i++) {
            if(!used[i]){
                if(i>0&&chars[i]==chars[i-1]&&used[i-1])
                    continue;
                tmp.append(chars[i]);
                used[i]=true;
                solution(chars,start+1,length,tmp,list,used);
                tmp.deleteCharAt(start);
                used[i]=false;
            }
        }
    }
}
