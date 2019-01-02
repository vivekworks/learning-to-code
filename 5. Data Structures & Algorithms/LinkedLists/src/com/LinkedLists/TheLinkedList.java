package com.LinkedLists;

public class TheLinkedList {
    private TheLink firstLink;

    private void insertLink(TheLink link){
        link.next = firstLink;
        firstLink = link;
    }

    private void removeFirst(){
        firstLink = firstLink.next;
    }

    private TheLink findLink(String bookName){
        TheLink currentLink  = firstLink;
        if(firstLink == null)
            return null;
        else{
            while(currentLink.bookName.equals(bookName)){
                if(currentLink.next != null)
                    currentLink = currentLink.next;
                 else
                    return null;
            }
        }
        return currentLink;
    }

    private void display(){
        TheLink link = firstLink;
        if(firstLink == null)
            System.out.println("List is empty");
        else{
            while(link.next != null){
                System.out.println(link.bookName+", "+link.millionsSold+" million copies sold");
                link = link.next;
            }
            System.out.println(link.bookName+", "+link.millionsSold+" million copies sold");
        }
    }

    public static void main(String[] args){
        TheLinkedList linkList = new TheLinkedList();
        linkList.insertLink(new TheLink("GUT",20));
        linkList.insertLink(new TheLink("12 RULES FOR LIFE",50));
        linkList.insertLink(new TheLink("INFERNO",450));
        linkList.insertLink(new TheLink("DA VINCI CODE",950));
        linkList.display();
        linkList.removeFirst();
        linkList.display();
        linkList.insertLink(new TheLink("COBRA",70));
        linkList.display();
        TheLink linkToFind = linkList.findLink("COBRA");
        System.out.println(linkToFind == null ? "Not found" : linkToFind.bookName+" - "+linkToFind.millionsSold+" - Next link : "+linkToFind.next.bookName);
    }
}
