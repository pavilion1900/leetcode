package org.example.hashtable.example;

import java.util.HashMap;
import java.util.Map;

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

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.setNext(tail);
        tail.setPrev(head);
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        remove(node);
        add(node);
        return node.getValue();
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
        }
        Node node = new Node(key, value);
        map.put(key, node);
        add(node);
        if (map.size() > capacity) {
            Node nodeDel = head.getNext();
            remove(nodeDel);
            map.remove(nodeDel.getKey());
        }
    }

    private void add(Node node) {
        Node prevNode = tail.getPrev();
        prevNode.setNext(node);
        node.setPrev(prevNode);
        node.setNext(tail);
        tail.setPrev(node);
    }

    private void remove(Node node) {
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
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

class Node {

    private final int key;
    private final int value;
    private Node next;
    private Node prev;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}