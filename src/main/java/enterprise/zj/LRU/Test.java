package enterprise.zj.LRU;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/19 19:32
 */
public class Test {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        lruCache.put(4,4);
        lruCache.put(5,5);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.cap);
        lruCache.put(6,6);
       System.out.println(lruCache.get(2));
       // System.out.println(lruCache.get(5));
        //lruCache.put(7,7);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.cap);
        System.out.println(lruCache.cache.size());
//        System.out.println(lruCache.get(2));
//        System.out.println(lruCache.get(3));



    }
}
