package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/29 15:44
 */
//字符串中的指定替换，form 替换为 to
public class Replace {
    public String replace(String str,String from,String to){
        if(str==null||from==null||str.equals("")||from.equals(""))
            return str;

        char[] chars =str.toCharArray();
        char[] tar= from.toCharArray();
        int match=0;

        for (int i = 0; i <chars.length ; i++) {
                if (chars[i]==tar[match++]){
                    if(match==tar.length){
                        clear(chars,i,match);
                        match=0;
                    }
                }else match=0;
        }
        String cur="";
        String res ="";
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]!=0){
                cur=cur+String.valueOf(chars[i]);
            }
            if(chars[i]==0&&(i==0||chars[i-1]!=0)){
                res=res+cur+to;
                cur="";
            }
        }

        if(!cur.equals(""))
            res=res+cur;

        return res;


//        String res =String.valueOf(chars);
//        return res.replaceAll(" ",to) ;

    }

    private void clear(char[] chars, int end, int len) {
//        if(chars==null||chars.equals(""))
//            return;
//        for (int i = end; i >end-len ; i--) {
//            chars[i]='0';
//        }

        while (len--!=0){
            chars[end--]=0;
        }
    }

    public static void main(String[] args) {
        String s= "222111qqq3qqq";
        System.out.println(new Replace().replace(s,"qqq","mm"));
    }
}
