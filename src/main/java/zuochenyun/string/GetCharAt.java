package zuochenyun.string;

public class GetCharAt {
    public char getCharAt(String str,int index){
        if(str==null||str.equals(""))
            return 0;

        char[] chars=str.toCharArray();
        int num=0;
        int sum=0;
        boolean flag=true;//false代表处在数字位
        char cur=0;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]=='-'){
                 flag=!flag;
            }else if(flag){ //处在字符位
                sum+=num;
                if(sum>index)
                    return cur;
                num=0;
                cur=chars[i];

            }else num=num*10+chars[i]-'0';

        }
        return sum+num>index?cur:0;
    }
}
