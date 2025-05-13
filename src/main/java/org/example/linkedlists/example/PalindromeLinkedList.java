package org.example.linkedlists.example;

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

//    public static boolean isPalindrome(ListNode5 head) {
//        ListNode5 curr = head;
//        List<Integer> list = new ArrayList<>();
//        while (curr != null) {
//            list.add(curr.val);
//            curr = curr.next;
//        }
//        int left = 0;
//        int right = list.size() - 1;
//        while (left < right) {
//            if (!list.get(left++).equals(list.get(right--))) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isPalindrome(ListNode5 head) {
        if (head == null) {
            return true;
        }
        ListNode5 endFirstHalf = endFirstHalf(head);
        ListNode5 rightHead = reverse(endFirstHalf.next);
        boolean rsl = true;
        ListNode5 p1 = head;
        ListNode5 p2 = rightHead;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) {
                rsl = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        reverse(rightHead);
        return rsl;
    }

    private static ListNode5 endFirstHalf(ListNode5 head) {
        ListNode5 slow = head;
        ListNode5 fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static ListNode5 reverse(ListNode5 head) {
        ListNode5 prev = null;
        ListNode5 curr = head;
        while (curr != null) {
            ListNode5 tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
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
