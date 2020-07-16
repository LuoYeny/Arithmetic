package miltiThread.stream.bit;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 11:14
 */
public class ReadDate {
    public void readMethed(PipedInputStream input){
        try {
            System.out.println("read:");
            byte[] bytes=new byte[30];
            int readLength=input.read(bytes);
            while (readLength!=-1){
                String newData = new String(bytes,0,readLength);
                System.out.print(newData+" ");
                readLength=input.read(bytes);
            }
            System.out.println();
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
