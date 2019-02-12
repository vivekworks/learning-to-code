package com.enumerations;

public enum Color {
    Red, Green, Blue, Yellow, Violet, Orange, Indigo,Pink(5),Teal(7),Turquoise(8);
    Color(){}
    Color(int p){price=p;}
    int price;
    public int getPrice(){
        return price;
    }
}
