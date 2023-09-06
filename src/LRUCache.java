import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer , Integer> {
    private int capacity;

    public LRUCache(int capacity){
        //当accessOrder的参数为true时，就会按照访问顺序排序
        super(capacity , 0.75F , true);
        this.capacity = capacity;
    }

    public int get(int key){
        return super.getOrDefault(key , -1);
    }
    public void put(int key , int value){
        super.put(key , value);
    }

    //重写当前方法，当内存超出的时候返回true
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }
}
