package com.enumerations;


import java.util.Scanner;

public class EnumCheck {
    public static void main(String[] args) {
        Color col = Color.valueOf(new Scanner(System.in).nextLine());
        switch (col) {
            case Red:
                System.out.println("Red");
                break;
            case Green:
                System.out.println("Green");
                break;
            default: System.out.println("Yellow");
        }
        for(var app :Color.values()){
            System.out.println(app);
        }
        for(Color app :Color.values()){
            System.out.println(app.getPrice());
        }
        if(col==Color.Indigo)
            System.out.println("Indigo at position "+Color.Indigo.ordinal());
        System.out.println(Color.Indigo.compareTo(Color.Orange));
        if(Color.Indigo.compareTo(Color.Red)==0)
            System.out.println("Indigo at position "+Color.Indigo.ordinal()+" - "+Color.Red.ordinal());
        System.out.println("Compare "+col.equals(Color.Indigo));

    }
}
