package com.LinkedLists;

public class TheLinkedList {
    private TheLink firstLink;

    private void insertLink(TheLink link) {
        link.next = firstLink;
        firstLink = link;
    }

    private void removeFirst() {
        firstLink = firstLink.next;
    }

    private TheLink findLink(String bookName) {
        TheLink currentLink = firstLink;
        if (isEmpty())
            return null;
        else {
            while (!currentLink.bookName.equals(bookName)) {
                if (currentLink.next != null)
                    currentLink = currentLink.next;
                else
                    return null;
            }
        }
        return currentLink;
    }

    private void removeLink(String bookName) {
        TheLink link = firstLink;
        TheLink prevLink = null;
        if (isEmpty())
            System.out.println("List is empty");
        else {
            while (!link.bookName.equals(bookName)) {
                if (link.next == null) {
                    System.out.println("Link not found");
                    return;
                } else {
                    prevLink = link;
                    link = link.next;
                }
            }
            if (prevLink == null)
                firstLink = firstLink.next;
            else
                prevLink.next = link.next;
        }
    }

    private void display() {
        TheLink link = firstLink;
        if (firstLink == null)
            System.out.println("List is empty");
        else {
            while (link.next != null) {
                System.out.println(link.bookName + ", " + link.millionsSold + " million copies sold");
                link = link.next;
            }
            System.out.println(link.bookName + ", " + link.millionsSold + " million copies sold");
        }
    }

    private boolean isEmpty() {
        return firstLink == null;
    }

    public static void main(String[] args) {
        TheLinkedList linkList = new TheLinkedList();
        linkList.insertLink(new TheLink("GUT", 20));
        linkList.insertLink(new TheLink("12 RULES FOR LIFE", 50));
        linkList.insertLink(new TheLink("INFERNO", 450));
        linkList.insertLink(new TheLink("DA VINCI CODE", 950));
        linkList.display();
        System.out.println("--------------------------------------------------------");
        linkList.removeFirst();
        linkList.display();
        System.out.println("--------------------------------------------------------");
        linkList.insertLink(new TheLink("COBRA", 70));
        linkList.display();
        System.out.println("--------------------------------------------------------");
        TheLink linkToFind = linkList.findLink("COBRA");
        System.out.println(linkToFind == null ? "Not found" : linkToFind.bookName + " - " + linkToFind.millionsSold + " - Next link : " + linkToFind.next.bookName);
        System.out.println("--------------------------------------------------------");
        linkList.removeLink("COBRA");
        linkList.display();
        System.out.println("--------------------------------------------------------");
        linkList.removeLink("12 RULES FOR LIFE");
        linkList.display();
        System.out.println("--------------------------------------------------------");
    }
}
