package miltiThread.stream.bit;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/1 11:07
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out){
        try {
            System.out.println("write ..");
            for (int i = 0; i <200 ; i++) {
                String outDate=" "+(i+1);
                out.write(outDate.getBytes());
                System.out.print(outDate+" ");
            }
            System.out.println();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
