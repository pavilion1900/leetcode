package org.example.linkedlists.example;

public class RemoveDuplicatesFromSortedList {

//    83. Remove Duplicates from Sorted List
//    Easy
//
//    Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
//    Return the linked list sorted as well.
//
//    Constraints:
//
//    - The number of nodes in the list is in the range [0, 300].
//    - -100 <= Node.val <= 100
//    - The list is guaranteed to be sorted in ascending order.

    public static void main(String[] args) {
        ListNode3 node4 = new ListNode3(2);
        ListNode3 node3 = new ListNode3(1, node4);
        ListNode3 node2 = new ListNode3(1, node3);
        ListNode3 node1 = new ListNode3(1, node2);
        printNodesValue(node1);
        deleteDuplicates(node1);
        printNodesValue(node1);

        ListNode3 node71 = new ListNode3(3);
        ListNode3 node61 = new ListNode3(3, node71);
        ListNode3 node51 = new ListNode3(3, node61);
        ListNode3 node41 = new ListNode3(2, node51);
        ListNode3 node31 = new ListNode3(1, node41);
        ListNode3 node21 = new ListNode3(1, node31);
        ListNode3 node11 = new ListNode3(1, node21);
        printNodesValue(node11);
        deleteDuplicates(node11);
        printNodesValue(node11);

        ListNode3 node32 = new ListNode3(2);
        ListNode3 node22 = new ListNode3(1, node32);
        ListNode3 node12 = new ListNode3(1, node22);
        printNodesValue(node12);
        deleteDuplicates(node12);
        printNodesValue(node12);
    }

    private static void printNodesValue(ListNode3 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode3 deleteDuplicates(ListNode3 head) {
        ListNode3 curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}

class ListNode3 {

    int val;
    ListNode3 next;

    ListNode3() {
    }

    ListNode3(int val) {
        this.val = val;
    }

    ListNode3(int val, ListNode3 next) {
        this.val = val;
        this.next = next;
    }
}