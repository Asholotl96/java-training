import java.util.*;
public class LRU extends LinkedHashMap<Integer, Integer>{
    int cap;
    public LRU(int cap) {
        super(cap,0.75f,true);
        this.cap=cap;
    }
    public int get(int k){
        return super.getOrDefault(k, -1);
    }
    public void put(int k,int val){
        super.put(k, val);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size()>cap;
    }
    public static void main(String[] args) {
        LRU lru=new LRU(3);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        System.out.println(""+lru.get(1));
        //System.out.println(""+lru.get(3));
        lru.put(4, 4);
        System.out.println(""+lru.get(2));
        lru.put(5,5);
        System.out.println(lru.get(3)+"");
    }
}
