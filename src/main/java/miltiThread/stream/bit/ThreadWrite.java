package miltiThread.stream.bit;

import java.io.PipedOutputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 11:23
 */
public class ThreadWrite extends Thread {
    private WriteData writeData;
    private PipedOutputStream out;

    public ThreadWrite(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
