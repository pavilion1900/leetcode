package org.example.linkedlists.task;

public class ReverseLinkedList {

//    206. Reverse Linked List
//    Easy
//
//    Given the head of a singly linked list, reverse the list, and return the reversed list.
//
//    Constraints:
//
//    - The number of nodes in the list is the range [0, 5000].
//    - -5000 <= Node.val <= 5000

    public static void main(String[] args) {
        ListNode4 node5 = new ListNode4(5);
        ListNode4 node4 = new ListNode4(4, node5);
        ListNode4 node3 = new ListNode4(3, node4);
        ListNode4 node2 = new ListNode4(2, node3);
        ListNode4 node1 = new ListNode4(1, node2);
        printNodesValue(node1);
        reverseList(node1);
        printNodesValue(node5);

        ListNode4 node21 = new ListNode4(2);
        ListNode4 node11 = new ListNode4(1, node21);
        printNodesValue(node11);
        reverseList(node11);
        printNodesValue(node21);

        ListNode4 node12 = null;
        printNodesValue(node12);
        reverseList(node12);
        printNodesValue(node12);
    }

    public static ListNode4 reverseList(ListNode4 head) {
        return null;
    }

    private static void printNodesValue(ListNode4 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode4 {

    int val;
    ListNode4 next;

    ListNode4() {
    }

    ListNode4(int val) {
        this.val = val;
    }

    ListNode4(int val, ListNode4 next) {
        this.val = val;
        this.next = next;
    }
}
