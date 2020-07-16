package miltiThread.stream.bit;

import java.io.PipedInputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 11:24
 */
public class ThreadRead extends Thread{
    private ReadDate readDate;
    private PipedInputStream input;

    public ThreadRead(ReadDate readDate, PipedInputStream input) {
        this.readDate = readDate;
        this.input = input;
    }

    @Override
    public void run() {
        readDate.readMethed(input);
    }
}
