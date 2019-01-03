package com.DoubleEndedLinkedLists;

class Neighbour {

    Neighbour next;
    Neighbour previous;

    private int houseNumber;
    private String houseOwner;

    Neighbour(int houseNumber, String houseOwner){
        this.houseNumber = houseNumber;
        this.houseOwner = houseOwner;
    }

    void display(){
        System.out.println("House No. "+houseNumber+", "+houseOwner+" & next : "+ (next == null ? "Last House " : next.houseOwner));
    }
}
