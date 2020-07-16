package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/2 14:45
 */
//单词顺序翻转
public class RotateWords {
    public void rotateWord(char[] chars){
        if(chars==null||chars.length==0)
            return;

        reverse(chars,0,chars.length-1);
        int l=-1;
        int r=-1;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]!=' '){
                l=i==0||chars[i-1]==' '?i:l;
                r=i==chars.length-1||chars[i+1]==' '?i :r;
            }

            if(l!=-1&&r!=-1){
                reverse(chars,l,r);
                l=-1;
                r=-1;
            }
        }
        System.out.println(String.valueOf(chars));
    }

    private void reverse(char[] chars, int start, int end) {
        char tmp=0;
        while (start<end){
             tmp =chars[start];
            chars[start]=chars[end];
            chars[end]=tmp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        String s="my name is buuu";
         new RotateWords().rotateWord(s.toCharArray());
    }
}
