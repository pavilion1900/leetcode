package org.example.linkedlists.example;

public class LinkedListCycle {

//    141. Linked List Cycle
//    Easy
//
//    Given head, the head of a linked list, determine if the linked list has a cycle in it.
//
//    There is a cycle in a linked list if there is some node in the list that can be reached again by continuously
//    following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer
//    is connected to. Note that pos is not passed as a parameter.
//
//    Return true if there is a cycle in the linked list. Otherwise, return false.

    public static void main(String[] args) {
        ListNode2 node1 = new ListNode2(3);
        ListNode2 node2 = new ListNode2(2);
        ListNode2 node3 = new ListNode2(0);
        ListNode2 node4 = new ListNode2(-4);
//        pos = 1
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node2);
        System.out.println(hasCycle(node1));     // true

        ListNode2 node11 = new ListNode2(1);
        ListNode2 node21 = new ListNode2(2);
//        pos = 0
        node11.setNext(node21);
        node21.setNext(node11);
        System.out.println(hasCycle(node11));     // true

        ListNode2 node12 = new ListNode2(1);
//        pos = -1
        System.out.println(hasCycle(node12));     // false

    }

//    public static boolean hasCycle(ListNode2 head) {
//        Set<ListNode2> set = new HashSet<>();
//        ListNode2 curr = head;
//        while (curr != null) {
//            if (set.contains(head)) {
//                return true;
//            }
//            set.add(curr);
//            curr = curr.next;
//        }
//        return false;
//    }

    public static boolean hasCycle(ListNode2 head) {
        if (head == null) {
            return false;
        }
        ListNode2 slow = head;
        ListNode2 fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}

class ListNode2 {

    int val;
    ListNode2 next;

    ListNode2(int x) {
        val = x;
        next = null;
    }

    public void setNext(ListNode2 next) {
        this.next = next;
    }
}
