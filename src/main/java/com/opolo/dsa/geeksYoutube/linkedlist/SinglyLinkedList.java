package com.opolo.dsa.geeksYoutube.linkedlist;

import java.util.Iterator;

class Node<T> {

    private T data;
    private Node<T> next;
    
    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    
}

class SinglyLinkedList<T> implements Iterable<T>{

    private Node<T> head;

    public void addAtFront(T data){
        Node<T> node = new Node<>(data);

        if(!(this.head == null)){ //list is not empty
            node.setNext(head);
        }
        this.head = node;
    }

    public void addAtEnd(T data){
        Node<T> newNode = new Node<>(data);
        Node<T> traverse = this.head;

        if(this.head == null){
            this.head = newNode;
        } else {
            while(traverse.getNext() != null){ //traverse to the node before the end node
                traverse = traverse.getNext();
            }

            //at this stage traverse is at last node
            traverse.setNext(newNode);
        }
    }

    //remove a node from a position
    public void remove(int position){
        Node<T> traverse = this.head;

        if(this.head == null){
            System.out.println("list is empty");
        }

        //if node to be deleted is the head node
        if(position == 0){
            this.head = traverse.getNext();
        }

        //list = [2,3,4,5], position = 3, node.data = 4
        //find the previous node of the node to be deleted
        for(int i=0; i < position-1 && traverse != null ;i++){
            traverse = traverse.getNext();
        }

        if(traverse == null || traverse.getNext() == null){
            System.out.println("position more than list size");
        }

        //unlink the node to be deleted
        traverse.setNext(traverse.getNext().getNext());
    }

    public void display(){
        Node<T> currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.getData());
            System.out.print(" -> ");
            currentNode = currentNode.getNext();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}

class Main{

    public static void main(String[] args) {

        SinglyLinkedList<Integer> ll = new SinglyLinkedList<>();
        //ll.addAtFront(5);
        //ll.addAtFront(8);

        ll.addAtEnd(5);
        ll.addAtEnd(8);
        ll.addAtEnd(11);
        ll.addAtEnd(1);
        ll.addAtEnd(2);
        ll.addAtEnd(7);

        ll.remove(4);

        ll.display();
    }
}
