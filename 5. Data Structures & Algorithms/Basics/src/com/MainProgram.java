package com;
import com.topics.*;

public class MainProgram {
    static{
        System.out.println("Main class Static Initializer");
    }
    MainProgram(){
        System.out.println("Main class Constructor");
    }
    public static void main(String[] args){
        /*TypeInference typeInference = new TypeInference();
        typeInference.varCheck();
        BitLogic bitLogic = new BitLogic();
        bitLogic.bitProcessing();
        ControlStatements ctrlStmts = new ControlStatements(10);
        System.out.println(ctrlStmts.loop);
        StaticBlocks.main(null);
        for(String cl :args)
            System.out.println(cl);
        var varargs = new VarArgs();
        varargs.checkVarArgs();
        varargs.checkVarArgs("a");
        varargs.checkVarArgs("a","b");
        varargs.checkVarArgs("a","b","c");
        Recursion recurse = new Recursion("VIVEK");
        recurse.printReverse("VIVEK".length()-1);*/
        //SuperClass sup = new SuperClass();
        /*System.out.println("Main class Main");
        SubClass sub = new SubClass();*/
        //sub.stuff();
        //sup = sub;
        //sub = sup;
        //SubClass sub1 = new SuperClass();
        //SuperClass sup1 = new SubClass();
        //sup.dob="";
        //sup.id=1;
        //sup1.dob = "";
        //AbstractSuperClass abSuper = new AbstractSuperClass();
        /*AbstractSubClass abSuper = new AbstractSubClass();
        abSuper.name="Triangle";
        abSuper.printName();
        abSuper.area();*/

        /*var a = new SubClass();
        a.stuff();
        var b = new SuperClass();
        //b.stuff(); !Error
        var c = getObject(0);
        //c.stuff(); !Error
        var d = getObject(1);
        //d.stuff(); !Error*/
        var varargs = new VarArgs();
        varargs.chick();
    }

    private static SuperClass getObject(int num){
        switch (num){
            case 0 : return new SubClass();
            case 1 : return new SuperClass();
            default: return null;
        }
    }
}
