package com.BinaryTrees;

class Node {
    int key;
    String name;
    Node leftChild;
    Node rightChild;
    Node(int key, String name){
        this.key=key;
        this.name=name;
    }
    public String toString(){
        return "Name at "+this.key+"is "+this.name;
    }
}
