package miltiThread.test;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/14 19:46
 */
public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        return 10;
    }


    public static void main(String[] args) {
        Future future = Executors.newFixedThreadPool(1).submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return 1;
            }
        });



    }
}
