package miltiThread.pc;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/6/26 10:47
 */
public class P {
    private Object lock;

    public P(Object lock) {
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                  //  System.out.println("P wait...");
                    lock.wait();
                }
                String value =System.currentTimeMillis()+"-"+System.nanoTime();
                System.out.println("set value  " +value);
                ValueObject.value=value;
                lock.notify();

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
