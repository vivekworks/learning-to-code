package com.Queues;

import java.util.Arrays;

public class TheQueue {

    private int[] theQueue;

    private int queueSize;

    private int front, rear=-1, numberOfElements;

    private TheQueue(int size){
        queueSize=size;
        theQueue = new int[size];
        Arrays.fill(theQueue,-1);
    }

    private void enQueue(int element){
        if (numberOfElements < queueSize) {
            theQueue[++rear] = element;
            numberOfElements++;
        } else{
            System.out.println("Queue is full");
        }
    }

    private void deQueue(){
        if(numberOfElements > 0) {
            theQueue[front++] = -1;
            numberOfElements--;
        }
        else
            System.out.println("Queue is empty");
    }

    private String peek(){
        if(numberOfElements > 0)
            return String.valueOf(theQueue[front]);
        return "Queue is empty";
    }

    private void display(){
        System.out.println("-------------------------------------------------------------");
        System.out.print("|  ");
        for (int i=0;i<queueSize;i++)
            System.out.print(i+"  |  ");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.print("| ");
        for (int element :theQueue)
            System.out.print((element == -1 ? "  " : element)+"  | ");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }

    private void priorityEnQueue(int element){
        if(numberOfElements == 0) {
            enQueue(element);
            display();
        }
        else{
                int j=numberOfElements;
                while( (j >= 0) && ((element < theQueue[j-1] && theQueue[j-1] != -1))){
                    theQueue[j] = theQueue[j-1];
                    j--;
                }
                theQueue[j] = element;
                numberOfElements++;
                rear++;
                display();
        }
    }

    public static void main(String[] args){
        TheQueue theQueueObject = new TheQueue(10);
        theQueueObject.display();
        theQueueObject.priorityEnQueue(10);
        theQueueObject.priorityEnQueue(13);
        theQueueObject.priorityEnQueue(19);
        theQueueObject.priorityEnQueue(18);
        theQueueObject.priorityEnQueue(15);
        theQueueObject.display();
        System.out.println(theQueueObject.front+" - "+theQueueObject.rear+" - "+theQueueObject.numberOfElements);
        theQueueObject.deQueue();
        theQueueObject.display();
        System.out.println(theQueueObject.front+" - "+theQueueObject.rear+" - "+theQueueObject.numberOfElements);
        System.out.println(theQueueObject.peek());
    }
}
