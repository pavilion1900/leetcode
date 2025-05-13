package org.example.linkedlists.task;

public class PalindromeLinkedList {

//    234. Palindrome Linked List
//    Easy
//
//    Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

    public static void main(String[] args) {
        ListNode5 node4 = new ListNode5(1);
        ListNode5 node3 = new ListNode5(2, node4);
        ListNode5 node2 = new ListNode5(2, node3);
        ListNode5 node1 = new ListNode5(1, node2);
        System.out.println(isPalindrome(node1)); // true

        ListNode5 node21 = new ListNode5(2);
        ListNode5 node11 = new ListNode5(1, node21);
        System.out.println(isPalindrome(node11)); // false

        ListNode5 node52 = new ListNode5(1);
        ListNode5 node42 = new ListNode5(2, node52);
        ListNode5 node32 = new ListNode5(3, node42);
        ListNode5 node22 = new ListNode5(2, node32);
        ListNode5 node12 = new ListNode5(1, node22);
        System.out.println(isPalindrome(node12)); // true
    }

    public static boolean isPalindrome(ListNode5 head) {
        return false;
    }
}

class ListNode5 {

    int val;
    ListNode5 next;

    ListNode5() {
    }

    ListNode5(int val) {
        this.val = val;
    }

    ListNode5(int val, ListNode5 next) {
        this.val = val;
        this.next = next;
    }
}
