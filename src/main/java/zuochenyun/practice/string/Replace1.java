package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 16:20
 */
//把字符串中的空格替换为20%
public class Replace1 {
    public char[] replace(char[] chars){
        if(chars==null||chars.length==0)
            return chars;
        int num=0;
        int len=0;
        for (len=0; len <chars.length&&chars[len]!=0 ; len++) {
            if(chars[len]==' ')
                num++;
        }


        int resLen =len+num*2-1;
        for (int i = len-1; i >=0 ; i--) {
            if(chars[i]!=' ')
            chars[resLen--]=chars[i];
            else {
                chars[resLen--]='0';
                chars[resLen--]='2';
                chars[resLen--]='%';
            }
        }
        return chars;
    }

    public static void main(String[] args) {

        char[] chars= {'q',' ',' ','b',' ','v','f',' ',' ',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        chars=new Replace1().replace(chars);
        System.out.println(String.valueOf(chars));
    }
}
