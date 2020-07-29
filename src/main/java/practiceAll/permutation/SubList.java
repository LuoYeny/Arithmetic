package practiceAll.permutation;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/24 15:27
 */
//含重复字符串的子串
public class SubList {
    public static void main(String[] args) {
        String s ="qweer";
        char[] chars =s.toCharArray();

        List<String> list = new LinkedList<>();

        for (int i = 0; i <chars.length ; i++) {
            StringBuffer tmp = new StringBuffer();
            if(i==0||(chars[i]!=chars[i-1])){  //去重
                for (int j = i; j <chars.length ; j++) {

                    tmp.append(chars[j]);
                    list.add(tmp.toString());
                }
            }

        }

        System.out.println(list);
    }
}
