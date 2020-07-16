package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/30 15:14
 */
//由统计字符串和 index 返回index指向的字符
public class GetCharAt {
    public char getCharAt(String str,int index){
        if(str==null||str.length()==0)
            return 0;
        char[] chars = str.toCharArray();
        boolean stage=true;//当前正在字符位
        int sum=0;
        int num=0;
        char cur=0;

        for (int i = 0; i <chars.length; i++) {
            if(chars[i]=='_')
                stage=!stage;
            else if(stage){
                sum=sum+num;
                if(sum>index)
                    return cur;
                num=0;
                cur=chars[i];

            }else {
               // num=num*10+Integer.valueOf(chars[i]);
                num=num*10+chars[i]-'0';
            }

        }
        sum=(sum+num);
        return sum>index?cur:0;
    }

    public static void main(String[] args) {
        System.out.println(new GetCharAt().getCharAt("a_10_b_10_d_2",9));
    }
}
