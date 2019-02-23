package com.lambda;

public class LambdaCheck  {
    void check(){
        MyNumber myNum;
        myNum = n -> n%2==0;
        System.out.println(myNum.getValue(4));
        MyNumber diffNum = n -> n>=0;
        System.out.println(diffNum.getValue(-1));
        Factors fact1 = (a, b) -> a/b==0;
        System.out.println(fact1.test(2,10));
        ZeroArgs zero = () -> 15;
        System.out.println(zero.zero());
        Runnable runny = () -> {System.out.println("Hello");};
        runny.run();
        runGenFI();
    }

    void runGenFI(){
        GenFI<Integer> genFI = i -> {
            int result=1;
            for(int j=i;j>0;j--)
                result*=j;
            return result;
        };
        System.out.println(genFI.action(5));
        GenFI<String> genFI1 = str -> {
            String result="";
            for(char val :str.toCharArray())
                result=val+result;
            return result;
        };
        System.out.println(genFI1.action("Sheila ki Jawani"));
        GenFI<?> genWildCard = w -> {
          if(w instanceof java.lang.String){
                  String result="";
                  for(char val :w.toString().toCharArray())
                      result=val+result;
                  return result;
          }
          else if(w instanceof java.lang.Integer){
              int result=1;
              for(int j=((Integer) w).intValue();j>0;j--)
                  result*=j;
              return result;
          }
          return w;
        };
        //String a="Hello";
        //genWildCard.action(a);
    }
}
