package miltiThread.join.joinAndLock;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 10:57
 */
public class ThreadA extends Thread {
    @Override
    public synchronized  void run() {
        try {
            System.out.println("ThreadA  begin");
            Thread.sleep(5000);
            System.out.println("ThreadA  end");
        } catch (InterruptedException e) {
            System.out.println("A");
            e.printStackTrace();
        }
    }

    public synchronized  void m1(){
        try {
            Thread.sleep(5000);
            System.out.println("thread m1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
