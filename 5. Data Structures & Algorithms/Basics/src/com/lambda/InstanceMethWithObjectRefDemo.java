package com.lambda;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v)) count++;
        return count;
    }

    static void check() {
        HighTemp[] highTemps1 = {new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83)};
        int count=counter(highTemps1,HighTemp::lessThanTemp,new HighTemp(89));
        System.out.println(count);
        count=counter(highTemps1,HighTemp::sameTemp,new HighTemp(89));
        System.out.println(count);
        HighTemp[] highTemps2 = {new HighTemp(32), new HighTemp(12), new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12), new HighTemp(-1), new HighTemp(13)};
        count=counter(highTemps2,HighTemp::lessThanTemp,new HighTemp(12));
        System.out.println(count);
        count=counter(highTemps2,HighTemp::sameTemp,new HighTemp(19));
        System.out.println(count);
    }
}
