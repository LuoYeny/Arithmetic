package miltiThread.pc;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/26 11:00
 */
public class C {
    private Object lock;

    public C(Object lock) {
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                if(ValueObject.value.equals("")){
              //      System.out.println("C wait...");
                    lock.wait();
                }

                System.out.println("get value  "+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
