package practiceAll.permutation;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/24 14:36
 */
//不含重复的全排列
public class Permutation {
    public static void main(String[] args) {

        String str ="qwe";
        List<String> list = new LinkedList<>();
        char[] chars =str.toCharArray();
        StringBuffer tmp = new StringBuffer();
        boolean[] used = new boolean[str.length()];

        solution(chars,0,str.length() ,list,used,tmp);
        System.out.println(list);

    }

    private static void solution(char[] chars, int start, int len, List<String> list,boolean[] used, StringBuffer tmp) {
        if(start==len){
            list.add(tmp.toString());
            return;
        }

        for (int i = 0; i <len ; i++) {
            if(!used[i]){
                tmp.append(chars[i]);
                used[i]=true;
                solution(chars,start+1,len,list,used,tmp);
                tmp.deleteCharAt(start);
                used[i]=false;
            }
        }

    }
}
