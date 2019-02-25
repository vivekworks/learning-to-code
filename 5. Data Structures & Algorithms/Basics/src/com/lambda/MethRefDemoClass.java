package com.lambda;

public class MethRefDemoClass {
    static double checkMeth(MethRefInterface mri, double param){
        return mri.getDoubleValue(param);
    }
    void methodReference(){
        double value =9.25;
        double a = checkMeth(this::insideMeth,value);
        System.out.println(a);
        double b = checkMeth(MethRefOutClass::methStatCheck,value);
        System.out.println(b);
        MethRefOutClass mroc = new MethRefOutClass();
        double c = checkMeth(mroc::methCheck,value);
        System.out.println(c);
    }
    double insideMeth(double value){
        System.out.println("MethRefOutClass.methCheck");
        return value/1.5;
    }
}
