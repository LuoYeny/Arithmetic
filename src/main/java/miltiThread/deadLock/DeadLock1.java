package miltiThread.deadLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/3 9:19
 */
public class DeadLock1 {

    public static void main(String[] args) {
        new DeadLock1().deadLock();
    }
    public void deadLock(){
        String s1="A";
        String s2="B";

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (s1){
                        System.out.println("进入t1--s1");
                        Thread.sleep(2000);
                        synchronized (s2){
                            System.out.println("进入t1--s2");
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s2){
                    System.out.println("进入t2--s2");

                    synchronized (s1){
                        System.out.println("进入t2--s1");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
