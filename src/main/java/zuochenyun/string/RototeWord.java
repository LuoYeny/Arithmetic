package zuochenyun.string;

public class RototeWord {
    public static char[] rototeWord(char[] chars){
        if(chars==null||chars.length==0)
            return null;
        reverse(chars,0,chars.length-1);
        int l=-1;
        int r=-1;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]!=' '){
                l=i==0||chars[i-1]==' '?i:l;
                r=i==chars.length-1||chars[i+1]==' '?i:r;
            }
            if(i!=-1&&r!=-1){
                reverse(chars,l,r);

                l=-1;
                r=-1;
            }
        }

        return chars;
    }

    private static  void reverse(char[] chars, int start, int end) {
        char tmp =0;
        while (start<end){
            tmp=chars[start];
            chars[start]=chars[end];
            chars[end]=tmp;
            end--;
            start++;
        }
    }

    public static void main(String[] args) {
        char[] chars="dog and cat".toCharArray();
        System.out.println(rototeWord(chars));
    }
}
