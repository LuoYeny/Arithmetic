package enterprise.zj.LRU;

import java.util.HashMap;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2020/7/19 19:11
 */
public class LRUCache {
    // key -> Node(key, val)
    public HashMap<Integer, Node> map;
    // Node(k1, v1) <-> Node(k2, v2)...
    public DoubleList cache;
    // 最大容量
    public int cap;

    public LRUCache(int capacity) {
           this.cap=capacity;
           this.map=new HashMap<>();
           this.cache= new DoubleList();
    }

    public int get(int key) {
         if(!map.containsKey(key)){
             return -1;
         }
         int val=map.get(key).val;
          put(key,val); //利用put方法把刚刚使用的值放入链表头

         return  val;

    }

    public void put(int key, int value) {
        Node node = new Node(key,value);
        if(map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(node);
            map.put(key, node);
        }else {
            if(cache.size()==cap){

               Node last= cache.removeLast();
                System.out.println("map.remove(last.key);"+ last.val);
                map.remove(last.key);
            }
            map.put(key,node);
            cache.addFirst(node);
        }


    }


}
