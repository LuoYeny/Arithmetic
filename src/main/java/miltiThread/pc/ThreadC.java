package miltiThread.pc;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/26 11:06
 */
public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        while (true)
            c.getValue();
    }
}
