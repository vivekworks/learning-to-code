package com.DoubleEndedLinkedLists;

public class Neighbour {

    public Neighbour next;
    public Neighbour previous;

    public int houseNumber;
    private String houseOwner;

    public Neighbour(int houseNumber, String houseOwner){
        this.houseNumber = houseNumber;
        this.houseOwner = houseOwner;
    }

    public void display(){
        System.out.println("House No. "+houseNumber+", "+houseOwner+" ; next : "+ (next == null ? "Last House " : next.houseOwner)+" ; previous : "+ (previous == null ? "First House " : previous.houseOwner));
    }
}
