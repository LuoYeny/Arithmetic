package geekBang.recall;




import java.util.LinkedList;
import java.util.List;


/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/16 17:00
 */
//无重复字符串的排列组合
public class Permutation {
    public void permutation(String S) {
        char[] chars = S.toCharArray();
        List<String> list = new LinkedList<>();
        solution(chars, 0, chars.length, list);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }

    private void solution(char[] chars, int start, int length, List<String> list) {
        char[] chars1 = new char[length];
        if (start == length) {
            list.add(new String(chars));
            return;
        }

        for (int i = start; i < length; i++) {
            swap(chars, start, i);
            solution(chars, start + 1, length, list);
            swap(chars, start, i);

        }

    }





    private void swap(char[] chars, int start, int i) {
        char tmp =chars[start];
        chars[start]=chars[i];
        chars[i]=tmp;
    }

    public static void main(String[] args) {
        new Permutation().permutation("ABC");
    }
}

