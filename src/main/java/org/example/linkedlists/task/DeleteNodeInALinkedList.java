package org.example.linkedlists.task;

public class DeleteNodeInALinkedList {

//    237. Delete Node in a Linked List
//    Medium
//
//    There is a singly-linked list head and we want to delete a node node in it.
//
//    You are given the node to be deleted node. You will not be given access to the first node of head.
//
//    All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node
//    in the linked list.
//
//    Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
//
//    The value of the given node should not exist in the linked list.
//    The number of nodes in the linked list should decrease by one.
//    All the values before node should be in the same order.
//    All the values after node should be in the same order.
//    Custom testing:
//
//    For the input, you should provide the entire linked list head and the node to be given node. node should not be
//    the last node of the list and should be an actual node in the list.
//    We will build the linked list and pass the node to your function.
//    The output will be the entire list after calling your function.

    public static void main(String[] args) {
        ListNode8 node1 = new ListNode8(4);
        ListNode8 node2 = new ListNode8(5);
        ListNode8 node3 = new ListNode8(1);
        ListNode8 node4 = new ListNode8(9);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        printNodesValue(node1); // 4 5 1 9
        deleteNode(node2);
        printNodesValue(node1); // 4 1 9

        ListNode8 node5 = new ListNode8(4);
        ListNode8 node6 = new ListNode8(5);
        ListNode8 node7 = new ListNode8(1);
        ListNode8 node8 = new ListNode8(9);
        node5.setNext(node6);
        node6.setNext(node7);
        node7.setNext(node8);
        printNodesValue(node5); // 4 5 1 9
        deleteNode(node7);
        printNodesValue(node5); // 4 5 9
    }

    public static void deleteNode(ListNode8 node) {

    }

    private static void printNodesValue(ListNode8 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode8 {

    int val;
    ListNode8 next;

    ListNode8(int x) {
        val = x;
    }

    public void setNext(ListNode8 next) {
        this.next = next;
    }
}
