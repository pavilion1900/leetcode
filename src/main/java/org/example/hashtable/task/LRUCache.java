package org.example.hashtable.task;

public class LRUCache {

//    146. LRU Cache
//    Medium
//
//    Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
//
//    Implement the LRUCache class:
//
//    LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
//    int get(int key) Return the value of the key if the key exists, otherwise return -1.
//    void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair
//    to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
//    The functions get and put must each run in O(1) average time complexity.

    public LRUCache(int capacity) {

    }

    public int get(int key) {
        return -1;
    }

    public void put(int key, int value) {

    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1)); // 1
        cache.put(3, 3);
        System.out.println(cache.get(2)); // -1
        cache.put(4, 4);
        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 3
        System.out.println(cache.get(4)); // 4
    }
}
