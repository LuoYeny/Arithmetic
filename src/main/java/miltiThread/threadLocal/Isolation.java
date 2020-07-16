package miltiThread.threadLocal;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/12 10:58
 */
public class Isolation {

        public static ThreadLocal t1=new ThreadLocal();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <100 ; i++) {
                         t1.set("threadA "+i);
                        System.out.println("threadA t1.get()"+  t1.get());
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <100 ; i++) {
                         t1.set("threadB "+i);
                        System.out.println("threadB t1.get()"+  t1.get());
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        try {
            for (int i = 0; i <100 ; i++) {
                 t1.set("Main "+i);
                System.out.println("Main t1.get()"+  t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
