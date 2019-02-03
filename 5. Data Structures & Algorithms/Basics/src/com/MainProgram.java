package com;
import com.topics.*;

public class MainProgram {
    public static void main(String[] args){
        /*TypeInference typeInference = new TypeInference();
        typeInference.varCheck();
        BitLogic bitLogic = new BitLogic();
        bitLogic.bitProcessing();
        ControlStatements ctrlStmts = new ControlStatements(10);
        System.out.println(ctrlStmts.loop);
        StaticBlocks.main(null);*/
        for(String cl :args)
            System.out.println(cl);
        var varargs = new VarArgs();
        varargs.checkVarArgs();
        varargs.checkVarArgs("a");
        varargs.checkVarArgs("a","b");
        varargs.checkVarArgs("a","b","c");
    }
}
