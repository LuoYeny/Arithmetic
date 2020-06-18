package zuochenyun.string;

public class Modify {
    public char[] modify(char[] chars){
        if(chars==null||chars.length==0)
            return null;
        int j=chars.length-1;
        for (int i = chars.length-1; i >-1 ; i--) {
            if(chars[i]!='*')
                chars[j--]=chars[i];
        }
        for ( ; j >-1 ;  ) {
            chars[j--]='*';
        }
        return chars;
    }
}
