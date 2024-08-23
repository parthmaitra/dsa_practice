package epam;

import java.util.*;

public class LRUCacheWorst {
    Map<Integer,Integer> cache = new HashMap<Integer, Integer>();
    Queue<Integer> lru;
    int capacity;
    public LRUCacheWorst(int capacity) {
        this.capacity=capacity;
        lru = new LinkedList<Integer>();
    }

    public int get(int key) {
        lru.remove(key);
        lru.add(key);
        Integer i = cache.get(key);
        return i==null?-1:i;
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.replace(key,value);
            lru.remove(key);
            lru.add(key);
        }
        else if(capacity==lru.size()){
            cache.remove(lru.remove());
            System.out.println(cache+" "+lru);
        }
        cache.put(key,value);
        lru.add(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */