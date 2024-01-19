package com.opolo.dsa.geeksYoutube.linkedlist.doublyendedlinkedlist;

public class DoublyEndedLinkedListDemo {
    
    public static void main(String[] args) {

        DoublyEndedLinkedList dList = new DoublyEndedLinkedList();
    
        dList.pushAtFront(5);
        dList.pushAtFront(7);
        dList.pushAtFront(11);
        dList.pushAtFront(1);

        dList.printList(dList.getHead());

    }
}
