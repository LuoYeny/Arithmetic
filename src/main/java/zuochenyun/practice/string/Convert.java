package zuochenyun.practice.string;

import java.util.concurrent.*;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/29 14:43
 */
//把整数字符串转换为整数
public class Convert {

    public boolean isValid(char[] chars){
        if(chars[0]!='-'&&(chars[0]>'9'||chars[0]<'0')){

            return false;
        }
        if(chars[0]=='-'&&(chars[1]=='0'||chars.length==1)){

            return false;
        }


        if(chars[0]=='0'&&chars.length>1){

            return false;
        }


        for (int i = 1; i <chars.length ; i++) {

            if(chars[i]>'9'||chars[i]<'0')
                return false;

        }

        return true;

    }


//正数的最大值 2147483647
//负数的最小值 -2147483648
    public int convert(String str){
        if(str==null||str.length()==0)
            return 0;
        char[] chars=str.toCharArray();
        if(!isValid(chars))
            return 0;
  //      System.out.println("isValid");
        boolean posi = chars[0]=='-'?false:true;
        int minq=Integer.MIN_VALUE/10;
        int minr=Integer.MIN_VALUE%10;

        int cur=0;
        int res=0;

        for (int i = posi?0:1; i <chars.length ; i++) {
            cur='0'-chars[i];  //当前数的负数
        //    System.out.println("cur "+cur);
            if(res<minq||(res==minq&&cur<minr))
                return 0; //溢出  不能转

            res=res*10+cur;

        }

        if(posi&&res==Integer.MIN_VALUE)
            return 0; //负数的最小值 -2147483648 转为正数时刚好溢出

        return posi?-res:res;





    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String s ="-12";
        System.out.println(new Convert().convert(s));

        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println();
                System.out.println("futureTask :"+Thread.currentThread());
                return 2;
            }
        });


       Future future =  Executors.newFixedThreadPool(1).submit(futureTask);
       Thread.sleep(2000);
        System.out.println( futureTask.get());
        System.out.println("main  :"+Thread.currentThread());
        Thread thread = new Thread(futureTask);
      //  thread.start();
    }
}
