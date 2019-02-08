package com.topics;

public class ChainedException {
    static void exception(){
        NullPointerException npe = new NullPointerException("Null pointer");
        npe.initCause(new ArithmeticException("Divide by zero"));
        throw npe;
    }
    public static void run() throws NullPointerException, ArithmeticException{
        try {
            int a = 10;
            if(a < 10)
                throw new NullPointerException();
            else
                throw new ArithmeticException();
        } catch (Exception e){
            //e = new Exception(); precise rethrow fails if exception variable is reassigned
            throw e;
        }
    }
}
