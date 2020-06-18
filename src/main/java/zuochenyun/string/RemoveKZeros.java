package zuochenyun.string;

public class RemoveKZeros {
    public static  String removeKZeros(int k, String str) {
        if (k < 1 || str == null)
            return str;
        char[] chars = str.toCharArray();
        int start = -1;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            char chr = chars[i];
            if (chr == '0') {
                start = start == -1 ? i : start;
                count++;
            } else {
                if (count == k) {
                    while (count-- != 0)
                        chars[start++] = 0;
                }
                count = 0;
                start = -1;
            }
        }
        //判断末尾的000...
        if (k == count) {
            while (count-- != 0) {
                chars[start++] = 0;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s="000sss00000sss0000";
        System.out.println(removeKZeros(3,s));
    }
}
