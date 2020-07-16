package miltiThread.waitAndNoyify.wn3_1_14;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 11:04
 */
public class Thread2 extends Thread{
    public Object lock;

    public Thread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Servce servce = new Servce();
        try {
            servce.synNotifyMethod(lock);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
