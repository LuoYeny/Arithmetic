package miltiThread.join.joinAndLock;

import java.sql.SQLOutput;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/9 12:46
 */
public class Test {
    public static void main(String[] args) {
        try {
            ThreadA threadA =new ThreadA();
            ThreadB threadB = new ThreadB(threadA);
            threadB.start();
            Thread.sleep(2000);
            ThreadC threadC = new ThreadC(threadA);
        threadC.start();
        } catch (Exception e) {
            System.out.println("main");
            e.printStackTrace();
        }
    }
}
