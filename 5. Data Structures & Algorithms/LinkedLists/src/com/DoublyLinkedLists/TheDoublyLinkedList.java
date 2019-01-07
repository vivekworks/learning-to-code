package com.DoublyLinkedLists;

import com.DoubleEndedLinkedLists.Neighbour;

public class TheDoublyLinkedList {

    private Neighbour firstNeighbour;
    private Neighbour lastNeighbour;

    private boolean isEmpty() {
        return firstNeighbour == null;
    }

    private void display() {
        if (!isEmpty()) {
            Neighbour searchNeighbour = firstNeighbour;
            while (searchNeighbour.next != null) {
                searchNeighbour.display();
                searchNeighbour = searchNeighbour.next;
            }
            searchNeighbour.display();
        }
    }

    private void insertFirst(String houseOwner, int houseNumber) {
        Neighbour newNeighbour = new Neighbour(houseNumber, houseOwner);
        if (isEmpty())
            lastNeighbour = newNeighbour;
        else
            firstNeighbour.previous = newNeighbour;
        newNeighbour.next = firstNeighbour;
        firstNeighbour = newNeighbour;
    }

    private void insertLast(String houseOwner, int houseNumber) {
        Neighbour newNeighbour = new Neighbour(houseNumber, houseOwner);
        if (isEmpty())
            firstNeighbour = newNeighbour;
        else
            lastNeighbour.next = newNeighbour;
        newNeighbour.previous = lastNeighbour;
        lastNeighbour = newNeighbour;
    }

    private void insertAfterKey(String houseOwner, int houseNumber, int key) {
        if (!isEmpty()) {
            Neighbour searchNeighbour = firstNeighbour;
            while (searchNeighbour.houseNumber != key) {
                searchNeighbour = searchNeighbour.next;
                if (searchNeighbour == null)
                    break;
            }
            if (searchNeighbour == null)
                System.out.println("Key not found");
            else {
                if (searchNeighbour.equals(firstNeighbour))
                    insertFirst(houseOwner, houseNumber);
                else if (searchNeighbour.equals(lastNeighbour))
                    insertLast(houseOwner, houseNumber);
                else {
                    Neighbour newNeighbour = new Neighbour(houseNumber, houseOwner);
                    newNeighbour.next = searchNeighbour.next;
                    newNeighbour.previous = searchNeighbour;
                    searchNeighbour.next.previous = newNeighbour;
                    searchNeighbour.next = newNeighbour;
                }
            }
        } else {
            System.out.println("List is empty");
        }
    }

    private void insertInOrder(String houseOwner, int houseNumber) {
        if (isEmpty()) {
            insertFirst(houseOwner, houseNumber);
        } else {
            Neighbour searchNeighbour = firstNeighbour, previousNeighbour = null;
            while (searchNeighbour != null && searchNeighbour.houseNumber < houseNumber) {
                previousNeighbour = searchNeighbour;
                searchNeighbour = searchNeighbour.next;
            }
            if (previousNeighbour == null)
                insertFirst(houseOwner, houseNumber);
            else if (searchNeighbour == null)
                insertLast(houseOwner, houseNumber);
            else {
                Neighbour newNeighbour = new Neighbour(houseNumber, houseOwner);
                newNeighbour.next = previousNeighbour.next;
                searchNeighbour.previous = newNeighbour;
                previousNeighbour.next = newNeighbour;
                newNeighbour.previous = previousNeighbour;
            }
        }
    }

    public static void main(String[] args){
        TheDoublyLinkedList doublyLinkedList = new TheDoublyLinkedList();
        doublyLinkedList.insertFirst("A",1);
        doublyLinkedList.insertFirst("C",3);
        doublyLinkedList.insertLast("Z",26);
        doublyLinkedList.insertAfterKey("B",2,1);
        doublyLinkedList.display();
        System.out.println("-------------------------------------------------");
        doublyLinkedList = new TheDoublyLinkedList();
        doublyLinkedList.insertInOrder("A",1);
        doublyLinkedList.insertInOrder("C",3);
        doublyLinkedList.insertInOrder("Z",26);
        doublyLinkedList.insertInOrder("B",2);
        doublyLinkedList.display();
        System.out.println("-------------------------------------------------");
    }

}
