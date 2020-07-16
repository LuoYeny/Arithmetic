package miltiThread.threadLocal;

import java.util.Date;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/12 11:21
 */
public class Inheritable {
    static class ThreadLocalExt extends  ThreadLocal{
        @Override
        protected Object initialValue() {
            return new Date().getTime();
        }



    }

    static class InheritableTL extends  InheritableThreadLocal{
        @Override
        protected Object initialValue() {
            return new Date().getTime();
        }

        @Override
        protected Object childValue(Object parentValue) {
            return parentValue+"  --------";
        }
    }

    public static InheritableTL t2 = new InheritableTL();
    public static void main(String[] args) throws InterruptedException {


        try {

            for (int i = 0; i <100 ; i++) {

                System.out.println("Main t1.get()"+  t2.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread.sleep(5000);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <100 ; i++) {

                        System.out.println("threadA t1.get()"+  t2.get());
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


}
