package com.opolo.dsa.geeksYoutube.linkedlist;

/**
 * Floyd’s Cycle Finding Algorithm
 * Time complexity: O(n), as the loop is traversed once. 
 * Auxiliary Space: O(1), only two pointers are used therefore constant space complexity.
 * 
 */
public class DetectCycleInLinkedList {

    private static Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (!(head == null)) {
            newNode.next = head;
        }
        head = newNode;
    }

    public static boolean detectLoop() {
        Node slowPointer = head;
        Node fastPointer = head;

        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycleInLinkedList l1 = new DetectCycleInLinkedList();
        // inserting new values
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);

        // adding a loop for the sake
        // of this example
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = head;

        // loop added;

        if (detectLoop())
            System.out.print("Loop exists in the"
                    + " Linked List" + "\n");
        else
            System.out.print("Loop does not exists "
                    + "in the Linked List" + "\n");

    }

}
