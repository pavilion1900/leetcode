package org.example.linkedlists.example;

public class AddTwoNumbers {

//    2. Add Two Numbers
//    Medium
//
//    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in
//    reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as
//    a linked list.
//
//    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    public static void main(String[] args) {
        ListNode9 node1 = new ListNode9(2);
        ListNode9 node2 = new ListNode9(4);
        ListNode9 node3 = new ListNode9(3);
        node1.setNext(node2);
        node2.setNext(node3);

        ListNode9 node4 = new ListNode9(5);
        ListNode9 node5 = new ListNode9(6);
        ListNode9 node6 = new ListNode9(4);
        node4.setNext(node5);
        node5.setNext(node6);

//                                                        2 4 3
//                                                      + 5 6 4 =
        printNodesValue(addTwoNumbers(node1, node4));  // 7 0 8

        ListNode9 node7 = new ListNode9();
        ListNode9 node8 = new ListNode9();

        printNodesValue(addTwoNumbers(node7, node8));  // 0

        ListNode9 node10 = new ListNode9(9);
        ListNode9 node11 = new ListNode9(9);
        ListNode9 node12 = new ListNode9(9);
        ListNode9 node13 = new ListNode9(9);
        ListNode9 node14 = new ListNode9(9);
        ListNode9 node15 = new ListNode9(9);
        ListNode9 node16 = new ListNode9(9);
        node10.setNext(node11);
        node11.setNext(node12);
        node12.setNext(node13);
        node13.setNext(node14);
        node14.setNext(node15);
        node15.setNext(node16);

        ListNode9 node17 = new ListNode9(9);
        ListNode9 node18 = new ListNode9(9);
        ListNode9 node19 = new ListNode9(9);
        ListNode9 node20 = new ListNode9(9);
        node17.setNext(node18);
        node18.setNext(node19);
        node19.setNext(node20);

//                                                         9 9 9 9 9 9 9
//                                                       + 9 9 9 9       =
        printNodesValue(addTwoNumbers(node10, node17)); // 8 9 9 9 0 0 0 1
    }

    public static ListNode9 addTwoNumbers(ListNode9 l1, ListNode9 l2) {
        ListNode9 preHead = new ListNode9(-1);
        ListNode9 prev = preHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            prev.next = new ListNode9(sum % 10);
            prev = prev.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return preHead.next;
    }

    private static void printNodesValue(ListNode9 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode9 {

    int val;
    ListNode9 next;

    ListNode9() {
    }

    ListNode9(int val) {
        this.val = val;
    }

    ListNode9(int val, ListNode9 next) {
        this.val = val;
        this.next = next;
    }

    public void setNext(ListNode9 next) {
        this.next = next;
    }
}
