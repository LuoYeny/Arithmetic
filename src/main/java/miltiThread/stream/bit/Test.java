package miltiThread.stream.bit;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 11:25
 */
public class Test {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadDate readDate =new ReadDate();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            outputStream.connect(inputStream);

            ThreadWrite threadWrite =new ThreadWrite(writeData,outputStream);
            threadWrite.start();
            ThreadWrite.sleep(2000);
            ThreadRead threadRead = new ThreadRead(readDate,inputStream);
            threadRead.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
