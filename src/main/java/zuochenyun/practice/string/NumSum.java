package zuochenyun.practice.string;


/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/28 15:10
 */
//字符串中的数字字串求和
public class NumSum {
    public int numSum(String s){
        char[] chars =s.toCharArray();
        int num=0;
        boolean posi=true;
        int res=0;
        int cur=0;
        for (int i = 0; i <chars.length ; i++) {
             cur =chars[i]-'0';//ASC码48就是'0'，也就是说'0'的值是48，而后依次是'1'到'9'。
                               // 这样正好是char型减去48就是它对应的int值。
             if(cur>9||cur<0){
                 res=res+num;
                 num=0;
                 if(chars[i]=='-'){
                     if(i-1>-1&&chars[i-1]=='-')//前一个为负,负负得正
                         posi=!posi;
                     else posi=false;
                 }else posi=true;

             }else {
                 num=num*10+(posi?cur:-cur);//12-17

             }

        }
        res=res+num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new NumSum().numSum("--1ppp-12p19"));
    }
}
