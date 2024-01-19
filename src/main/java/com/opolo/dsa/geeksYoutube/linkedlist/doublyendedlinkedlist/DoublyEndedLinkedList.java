package com.opolo.dsa.geeksYoutube.linkedlist.doublyendedlinkedlist;

public class DoublyEndedLinkedList {

    private Node head;

    // Add a node at the front in a Doubly Linked List:
    public void pushAtFront(int data) {

        // prepare the new node
        Node newNode = new Node(data);

        if (head != null) {
            newNode.setNext(this.head);
            newNode.setPrev(null);

            this.head.setPrev(newNode);

            this.head = newNode;
            
        } else {
            this.head = newNode;
        }
    }

    public void printList(Node node) {

        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
