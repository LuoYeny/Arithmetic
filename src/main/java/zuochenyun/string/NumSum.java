package zuochenyun.string;

public class NumSum {
    public static int numSum(String str){
        if(str==null)
            return 0;
        int res=0;
        int num=0;
        boolean posi=true;
        int chari=0;
        char[] charArr = str.toCharArray();
        for (int i = 0; i <charArr.length ; i++) {
             chari=charArr[i]-'0';//字符参加运算转为整形
             if(chari<0||chari>9){
                 res+=num;
                 num=0;
                 if(charArr[i]=='-'){
                     if(i>0&&charArr[i-1]=='-'){
                         posi=!posi;
                     }else posi=false;
                 }else posi=true;
             }else {
                 num=num*10+(posi?chari:-1*chari);

             }

        }
        res+=num;
        return res;

    }

    public static void main(String[] args) {
        String s="-123*&-1--2--1**";
        System.out.println(numSum(s));
    }
}
