package com.lambda;

public class LambdaExceptionDemo {
    int k;
    static int jk=0;
    void demoCheck() throws EmptyArrayException{
        int j=0;
        double[] avgValues = {1.5, 2.5, 3.5, 4.5, 5.5};
        FIException fie = (arr) -> {
            double sum = 0;
            if (arr.length == 0)
                //throw new Exception();//doesn't compile
                throw new EmptyArrayException();
            for (double val : arr)
                sum += val;
            k++;
            jk++;
            //j++;//Doesn't compile as the variable is effectively final
            return sum / arr.length;
        };
        System.out.println(fie.average(avgValues));
        System.out.println(fie.average(new double[0]));
    }
}
