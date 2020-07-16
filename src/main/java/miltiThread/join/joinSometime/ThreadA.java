package miltiThread.join.joinSometime;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 10:57
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("ThreadA  begin");
            Thread.sleep(5000);
            System.out.println("ThreadA  end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
