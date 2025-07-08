package org.example.array.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandomO1 {

//    380. Insert Delete GetRandom O(1)
//    Medium
//
//    Implement the RandomizedSet class:
//
//    - RandomizedSet() Initializes the RandomizedSet object.
//    - bool insert(int val) Inserts an item val into the set if not present.
//    Returns true if the item was not present, false otherwise.
//    - bool remove(int val) Removes an item val from the set if present.
//    Returns true if the item was present, false otherwise.
//    - int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least
//    one element exists when this method is called). Each element must have the same probability of being returned.
//
//    You must implement the functions of the class such that each function works in average O(1) time complexity.

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(1)); // true
        System.out.println(obj.remove(2)); // false
        System.out.println(obj.insert(2)); // true
        System.out.println(obj.getRandom());     // 1 or 2
        System.out.println(obj.remove(1)); // true
        System.out.println(obj.insert(2)); // false
        System.out.println(obj.getRandom());     // 2
    }
}

//    Approach 1: HashMap + ArrayList
//    Time complexity  : O(1)
//    Space complexity : O(N)

class RandomizedSet {

    private final List<Integer> list;
    private final Map<Integer, Integer> map;
    private final Random random;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int lastElement = list.get(list.size() - 1);
        int index = map.get(val);
        list.set(index, lastElement);
        map.put(lastElement, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
