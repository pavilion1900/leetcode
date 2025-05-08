package org.example.linkedlists.task;

public class MiddleOfTheLinkedList {

//    876. Middle of the Linked List
//    Easy
//
//    Given the head of a singly linked list, return the middle node of the linked list.
//    If there are two middle nodes, return the second middle node.

//    Constraints:
//    The number of nodes in the list is in the range [1, 100].
//    1 <= Node.val <= 100

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        System.out.println(middleNode(node1).val);     // 3

        ListNode node61 = new ListNode(6);
        ListNode node51 = new ListNode(5, node61);
        ListNode node41 = new ListNode(4, node51);
        ListNode node31 = new ListNode(3, node41);
        ListNode node21 = new ListNode(2, node31);
        ListNode node11 = new ListNode(1, node21);
        System.out.println(middleNode(node11).val);     // 4
    }

    public static ListNode middleNode(ListNode head) {
        return null;
    }
}

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
