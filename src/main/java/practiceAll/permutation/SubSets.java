package practiceAll.permutation;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/24 15:04
 */
//不重复字符串的子序列
public class SubSets {
    public static void main(String[] args) {
        String str= "asc";
        char[] chars = str.toCharArray();
        StringBuffer tmp = new StringBuffer();
        List<String> list = new LinkedList<>();

        solution2(chars,0,chars.length,tmp,list);
        System.out.println(list);
    }

    private static void solution(char[] chars, int start, int length, StringBuffer tmp, List<String> list) {

        list.add(tmp.toString());
        for (int i = start; i <length ; i++) {
            tmp.append(chars[i]);
            solution(chars,i+1,length,tmp,list);
            tmp.deleteCharAt(tmp.length()-1);
        }

    }
//01背包解法
    private static void solution2(char[] chars, int start, int length, StringBuffer tmp, List<String> list) {
      if(start==length){
          list.add(tmp.toString());
          return;
      }


        solution(chars,start+1,length,tmp,list);


        tmp.append(chars[start]);

        solution(chars,start+1,length,tmp,list);

    }
}
