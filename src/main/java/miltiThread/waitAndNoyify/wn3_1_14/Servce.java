package miltiThread.waitAndNoyify.wn3_1_14;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 11:02
 */
public class Servce {
    public void testMethod(Object lock)   {
        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+"  begin wait ...");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ;
            System.out.println(Thread.currentThread().getName()+"  end wait ...");
        }

    }

    public void synNotifyMethod(Object lock) throws InterruptedException {
        synchronized (lock){
            System.out.println(Thread.currentThread().getName()+"  begin wait ..."+System.currentTimeMillis());
                lock.notify();
                Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"  end wait ..."+System.currentTimeMillis());
        }
    }
}
