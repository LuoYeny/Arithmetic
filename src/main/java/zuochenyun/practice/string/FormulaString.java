package zuochenyun.practice.string;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/7 15:24
 */
//求公式字符串的结果，默认公式是正确的
public class FormulaString {
    public int getValue(String str){
        return value(str.toCharArray(),0)[0];
    }

    private int[] value(char[] chars, int i) {
        Deque<String> deq = new LinkedList<>();
        int pre=0;
        int[] bra=null;
        while (i<chars.length&&chars[i]!=')'){
            if(chars[i]<='9'&&chars[i]>='0'){
                pre=pre*10+chars[i++]-'0';
            }else if(chars[i]!='('){
                addValue(deq,pre);
                deq.addLast(String.valueOf(chars[i++]));
                pre=0;
            }else {
                bra=value(chars,i+1);
                pre=bra[0];
                i=bra[1]+1;
            }
        }

        addValue(deq,pre);
        return new int[]{getNum(deq),i};
    }

    private int getNum(Deque<String> deq) {
        int res=0;
        boolean add=true;
        int num=0;
        while (!deq.isEmpty()){
            String cur=deq.pollFirst();
            if(cur.equals("+")){
                add=true;

            }else if(cur.equals("-")){
                add=false;

            }else {
                 num=Integer.valueOf(cur);
                 res+=add?num:(-num);
            }
        }

        return res;
    }

    private void addValue(Deque<String> deq, int num) {
        int cur=0;
        if(!deq.isEmpty()){
            String top=deq.pollLast();
            if(top.equals("+")||top.equals("-")){
                deq.addLast(top);
            }else {
                cur=Integer.valueOf(deq.pollLast());
                num=top.equals("*")?cur*num:cur/num;
            }
        }

        deq.addLast(String.valueOf(num));
    }


    public static void main(String[] args) {
        String s="1+3*(2-1)";
        System.out.println(new FormulaString().getValue(s));
    }
}
