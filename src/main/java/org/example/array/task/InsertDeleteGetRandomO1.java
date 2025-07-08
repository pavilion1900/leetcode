package org.example.array.task;

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

class RandomizedSet {

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        return false;
    }

    public boolean remove(int val) {
        return false;
    }

    public int getRandom() {
        return -1;
    }
}
