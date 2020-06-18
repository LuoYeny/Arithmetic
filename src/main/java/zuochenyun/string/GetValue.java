package zuochenyun.string;

import java.util.Deque;
import java.util.LinkedList;

public class GetValue {
    public static int getValue(String str){
        return  value(str.toCharArray(),0)[0];
    }

    private static int[] value(char[] chars, int i) {
        Deque<String> deque = new LinkedList<String>();
        int pre=0;
        int bra[]=null;
        while (i<chars.length&&chars[i]!=')'){
            if(chars[i]>='0'&&chars[i]<='9'){
             //   System.out.println(chars[i]);
                pre=pre*10+chars[i++]-'0';

            } else if(chars[i]!='('){
          //      System.out.println("pre "+pre);
                addNum(deque,pre);
                deque.addLast(String.valueOf(chars[i++]));
                pre=0;

            }else {
                bra=value(chars,i+1);
                pre=bra[0];
                i=bra[1]+1;
            }
        }
        addNum(deque,pre);
        return new int[]{getNum(deque),i};
    }

    private static int getNum(Deque<String> deque) {
        int res=0;
        boolean add=true;
        String cur=null;
        int num=0;
        while (!deque.isEmpty()){
            cur=deque.pollFirst() ;
            if(cur.equals("-")){
                add=false;
            }else if(cur.equals("+")){
                add=true;
            }else {
                num=Integer.valueOf(cur);
                res+= add?num:(-num );
            }
        }
        System.out.println("res "+res);
        return res;
    }

    private static void addNum(Deque<String> deque, int num) {
        if(!deque.isEmpty()){
          //  System.out.println(deque);
            int cur=0;
            String top = deque.pollLast();

            if(top.equals("+")||top.equals("-")){
                deque.addLast(top);
            }else {
                cur=Integer.valueOf(deque.pollLast());
                num=top.equals("*")?num*cur:cur/num;

            }

        }
      //  System.out.println("num "+num);
      //  System.out.println("String.valueOf(num) "+String.valueOf(num));
        deque.addLast(String.valueOf(num));
    }

    public static void main(String[] args) {
        String s="1+2*(1+2+(7-1))";
        System.out.println(getValue(s));


    }
}
