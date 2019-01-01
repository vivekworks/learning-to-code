package com.Stacks;

import java.util.Arrays;

public class TheStack {

    private int[] theStack;

    private int stackSize;

    private int topOfStack=-1;

    private TheStack(int size){
        stackSize=size;
        theStack=new int[size];
        Arrays.fill(theStack,-1);
    }

    private void push(int element){
        if(topOfStack < stackSize-1)
            theStack[++topOfStack] = element;
        else
            System.out.println("Stack is full");
    }

    private void pop(){
        if(topOfStack < 0)
            System.out.println("Stack is empty");
        else
            theStack[topOfStack--] = -1;
    }

    private int peek(){
        return theStack[topOfStack];
    }

    private void popAll(){
        while(topOfStack >= 0)
            pop();
    }

    private void pushMany(String elementList){
        String[] elementArray = elementList.split(" ");
        for(String element :elementArray)
            push(Integer.parseInt(element));
    }

    private void displayStack(){
        System.out.println("-------------------------------------------------------------");
        System.out.print("|  ");
        for (int i=0;i<stackSize;i++)
            System.out.print(i+"  |  ");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.print("| ");
        for (int element :theStack)
            System.out.print((element == -1 ? "  " : element)+"  | ");
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args){
        TheStack theStack = new TheStack(10);
        theStack.displayStack();
        theStack.push(12);
        theStack.push(14);
        theStack.push(15);
        theStack.push(19);
        theStack.push(12);
        theStack.push(14);
        theStack.push(15);
        theStack.push(19);
        theStack.push(12);
        theStack.push(14);
        theStack.push(15);
        theStack.push(19);
        theStack.displayStack();
        theStack.pop();
        theStack.displayStack();
        System.out.println(theStack.peek());
        theStack.popAll();
        theStack.displayStack();
        theStack.pushMany("12 14 15 18 16 17 19 21 23 14 12 13 20");
        theStack.displayStack();
    }


}
