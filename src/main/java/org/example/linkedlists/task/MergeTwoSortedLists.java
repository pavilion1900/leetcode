package org.example.linkedlists.task;

public class MergeTwoSortedLists {

//    21. Merge Two Sorted Lists
//    Easy
//
//    You are given the heads of two sorted linked lists list1 and list2.
//
//    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//    Return the head of the merged linked list.

    public static void main(String[] args) {
        ListNode6 node1 = new ListNode6(1);
        ListNode6 node2 = new ListNode6(2);
        ListNode6 node3 = new ListNode6(4);
        node1.setNext(node2);
        node2.setNext(node3);

        ListNode6 node11 = new ListNode6(1);
        ListNode6 node21 = new ListNode6(3);
        ListNode6 node31 = new ListNode6(4);
        node11.setNext(node21);
        node21.setNext(node31);

        ListNode6 mergedHead = mergeTwoLists(node1, node11);
        printNodesValue(mergedHead); // 1 1 2 3 4 4
    }

    public static ListNode6 mergeTwoLists(ListNode6 list1, ListNode6 list2) {
        return null;
    }

    private static void printNodesValue(ListNode6 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode6 {

    int val;
    ListNode6 next;

    ListNode6() {
    }

    ListNode6(int val) {
        this.val = val;
    }

    ListNode6(int val, ListNode6 next) {
        this.val = val;
        this.next = next;
    }

    public void setNext(ListNode6 next) {
        this.next = next;
    }
}
