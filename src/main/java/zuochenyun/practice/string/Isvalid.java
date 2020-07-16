package zuochenyun.practice.string;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/6 16:12
 */
//是否是有效括号字符串
public class Isvalid {
    public boolean isValid(String str){
        if(str==null||str.length()==0)
            return true;

        char[] chars = str.toCharArray();
        int left=0;

        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]!='('||chars[i]!=')')
                return false;

           if(chars[i]=='(')  {
               left++;
           }
           if(chars[i]==')'&&--left<0){
               return false;
           }

        }

         return left==  0;

    }
}
