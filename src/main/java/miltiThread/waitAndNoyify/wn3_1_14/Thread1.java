package miltiThread.waitAndNoyify.wn3_1_14;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/25 11:04
 */
public class Thread1 extends Thread{
    public Object lock;

    public Thread1(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        Servce servce = new Servce();
        servce.testMethod(lock);
    }
}
