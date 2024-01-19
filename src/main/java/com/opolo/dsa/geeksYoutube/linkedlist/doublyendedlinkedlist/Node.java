package com.opolo.dsa.geeksYoutube.linkedlist.doublyendedlinkedlist;

public class Node {

    private int data;
    private Node prev;
    private Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public Node getPrev() {
        return this.prev;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
