package com.topics;


public class MainProgram {
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
        //d.stuff(); !Error
        var varargs = new VarArgs();
        varargs.chick();*/
        //ChainedException.run();

        /*try{
            for(int i=0;i<5;i++){
                System.out.println("Main Thread : "+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ie){
            System.out.println("Main thread interrupted");
        }*/
        /*Recursion recurs = new Recursion();
        NewThread newThread1 = new NewThread("Thread1",recurs);
        NewThread newThread2 = new NewThread("Thread2",recurs);
        NewThread newThread3 = new NewThread("Thread3",recurs);
        newThread1.thread.start();
        newThread2.thread.start();
        newThread3.thread.start();
        try{
            newThread1.thread.join();
            newThread2.thread.join();
            newThread3.thread.join();
        } catch (InterruptedException ie){
            System.out.println("Child threads error");
        }
        System.out.println(newThread1.thread.isAlive()+" , "+newThread2.thread.isAlive()+" , "+newThread3.thread.isAlive());
        System.out.println("Main Thread Exiting");*/
        /*Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);
        producer.thread.start();
        consumer.thread.start();*/
        Deadlock dead = new Deadlock();
        dead.startLock();
        //new Thread(dead).start();
        //dead.callOtherOne();

    }

    private static SuperClass getObject(int num){
        switch (num){
            case 0 : return new SubClass();
            case 1 : return new SuperClass();
            default: return null;
        }
    }
}
