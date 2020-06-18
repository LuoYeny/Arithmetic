package geekBang.recall;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/17 17:24
 */
//给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
public class Partition {
    public List<List<String>> partition(String s) {
        if(s==null)
            return null;
        List<List<String>> lists=new LinkedList<>();
        List<String> list=new LinkedList<>();
        solution(s,list,lists);
        return lists;

    }

    private void solution(String s, List<String> list, List<List<String>> lists) {
        if(s==null||s.length()==0){
            lists.add(new LinkedList<>(list));
            System.out.println(list);
            return;
        }
        for (int i = 1; i <=s.length() ; i++) {
            if(checkPalindrome(s.substring(0,i) )){

                list.add(s.substring(0,i));
                solution(s.substring(i),list,lists);
                list.remove(list.size()-1);


            }

        }
    }

    private boolean checkPalindrome(String s ) {
        int left=0;
        int right=s.length()-1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

                left++;
                right--;

        }

        return true;
    }


    public static void main(String[] args) {
        new Partition().partition("aaqb");
    }
}
