package com.DoubleEndedLinkedLists;

public class TheDELinkedList {
    private Neighbour firstHouse;
    private Neighbour lastHouse;

    private boolean isEmpty() {
        return firstHouse == null;
    }

    private void insertFirst(int houseNumber, String houseOwner) {
        Neighbour newNeighbour = new Neighbour(houseNumber, houseOwner);
        if (isEmpty())
            lastHouse = newNeighbour;
        newNeighbour.next = firstHouse;
        firstHouse = newNeighbour;
    }

    private void insertLast(int houseNumber, String houseOwner) {
        Neighbour newNeighbour = new Neighbour(houseNumber, houseOwner);
        if(isEmpty())
            insertFirst(houseNumber,houseOwner);
        else{
            lastHouse.next = newNeighbour;
            lastHouse=newNeighbour;
        }
    }

    private void display() {
        if (!isEmpty()) {
            Neighbour link = firstHouse;
            while (link.next != null) {
                link.display();
                link = link.next;
            }
            link.display();
        }
    }

    public static void main(String[] args) {
        TheDELinkedList deLinkedList = new TheDELinkedList();
        deLinkedList.insertFirst(1, "Ishani");
        deLinkedList.insertFirst(2, "Bike");
        deLinkedList.insertFirst(3, "Suja");
        deLinkedList.insertFirst(4, "House");
        deLinkedList.insertFirst(5, "Nidish");
        deLinkedList.display();
        System.out.println("-----------------------------------------");
        deLinkedList.insertLast(0, "Kinish");
        deLinkedList.display();
        System.out.println("-----------------------------------------");
        deLinkedList.insertFirst(7, "Mithun");
        deLinkedList.display();
        System.out.println("-----------------------------------------");
    }
}

