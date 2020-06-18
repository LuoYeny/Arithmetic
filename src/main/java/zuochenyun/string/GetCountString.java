package zuochenyun.string;

public class GetCountString {
    public static String getCountString(String str){
        if(str.equals("")||str==null)
            return "";
        char[] chars = str.toCharArray();

        int num=1;
        String res=String.valueOf(chars[0]);
        for (int i = 1; i <chars.length ; i++) {
            if(chars[i]!=chars[i-1]){
                res=concat(res,String.valueOf(num),String.valueOf(chars[i]));
                num=1;
            }else num++;
        }

        return concat(res,String.valueOf(num),"");
    }

    private static String concat(String s1, String s2, String s3) {
        return s1+"-"+s2+(s3.equals("")?s3:"-"+s3);
    }

    public static void main(String[] args) {
        String s="aaabbbbdddwffaa";
        System.out.println(getCountString(s));
    }
}
