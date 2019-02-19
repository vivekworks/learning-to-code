package com.generics;

public class BoundedWildcardDemo {
    void showDemo(){
        FourD fourDOne = new FourD(1,2,3,4);
        FourD fourDTwo = new FourD(2,3,4,5);
        FourD[] fourDArray = {fourDOne, fourDTwo};
        CoOrds<FourD> fourDCoOrds = new CoOrds<>(fourDArray);
        showXYZ(fourDCoOrds);
        TwoD twoDOne = new TwoD(1,2);
        TwoD twoDTwo = new TwoD(3,2);
        TwoD[] twoDArray = {twoDOne, twoDTwo};
        CoOrds<TwoD> twoDCoOrds = new CoOrds<>(twoDArray);
        //showXY(twoDCoOrds);//Compilation error because of the bounded wildcard
        ThreeD ThreeDOne = new ThreeD(1,2,3);
        ThreeD ThreeDTwo = new ThreeD(2,3,4);
        ThreeD[] threeDArray = {ThreeDOne, ThreeDTwo};
        CoOrds<ThreeD> threeDCoOrds = new CoOrds<>(threeDArray);
        showXY(threeDCoOrds);
        showXY(twoDCoOrds);//The class and the super classes are allowed
    }

    void showXYZ(CoOrds<? extends ThreeD> coordinates){
        for(int i=0;i<coordinates.coords.length;i++) {
            System.out.println(coordinates.coords[i].x);
            System.out.println(coordinates.coords[i].y);
            System.out.println(coordinates.coords[i].z);//--Gives compilation error with Bounded Wildcard for TwoD objects.
        }
    }

    void showXY(CoOrds<? super ThreeD> coordinates){
        for(int i=0;i<coordinates.coords.length;i++) {
            System.out.println(coordinates.coords[i].x);
            System.out.println(coordinates.coords[i].y);
            //System.out.println(coordinates.coords[i].z);//--Gives compilation error with Bounded Wildcard for TwoD.
        }
    }
}
