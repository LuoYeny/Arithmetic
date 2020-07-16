package miltiThread.pc;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/26 11:06
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    @Override
    public void run() {
        super.run();
        while (true)
            p.setValue();
    }
}
