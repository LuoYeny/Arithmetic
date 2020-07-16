package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 14:50
 */
//返回字符串的统计字符串 aaaabbbba----->a_4_b_4_a_1
public class GetCountString {
    public String getCountString(String str){
        if(str==null||str.length()==0)
            return "";

        char[] chars =str.toCharArray();
        String res =String.valueOf(chars[0]);
        int num=1;
        for (int i = 1; i <chars.length ; i++) {
            if(chars[i-1]!=chars[i]){
                res=concat(res,String.valueOf(num),String.valueOf(chars[i]));
                num=1;

            }else num++;
        }

        res=concat(res,String.valueOf(num),"");

        return res;

    }

    private String concat(String str1, String num, String str2) {
        return str1+"_"+num+(str2==""?str2:"_"+str2);
    }


    public static void main(String[] args) {
        System.out.println(new GetCountString().getCountString("aaabbbavvgg"));
    }

}
