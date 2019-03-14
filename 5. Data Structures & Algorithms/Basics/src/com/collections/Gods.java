package com.collections;

public enum Gods {
    Shiva(1), Vishnu(2), Ganesh(3), Karthik(4), Hanuman(5), Ayyappa(6), Krishna(7);
    Gods(int order){
        godOrder=order;
    }
    private int godOrder;
    public int getGodOrder(){
        return godOrder;
    }
}
