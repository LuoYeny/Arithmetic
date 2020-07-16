package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 15:48
 */
//字符串中如果有连续的k个0则移除
public class RemoveKZero {
    public String removeKzero(String s, int k) {
        if (s.length() < k)
            return s;
        char[] chars = s.toCharArray();
        int count = 0;
        int start = -1;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                count++;
                start = start == -1 ? i : start;//记录开头位置
            } else {
                if (count == k) {
                    for (int j = 0; j < k; j++) {
                        chars[start++] =' ';
                    }
                    count = 0;
                    start = -1;
                }

            }

        }
        if (count == k) {
            for (int j = 0; j < k; j++) {
                chars[start++] = ' ';
            }
        }

        return String.valueOf(chars).replaceAll(" ","");
    }

    public static void main(String[] args) {
        System.out.println(new RemoveKZero().removeKzero("kkk000k",3));
    }
}