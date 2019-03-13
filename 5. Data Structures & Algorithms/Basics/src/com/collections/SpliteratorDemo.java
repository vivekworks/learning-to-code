package com.collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    static void check() {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(2.0);
        doubles.add(3.0);
        doubles.add(4.0);
        doubles.add(5.0);
        doubles.add(6.0);
        doubles.add(7.0);
        doubles.add(8.0);
        System.out.println(doubles);
        Spliterator doubleSplit = doubles.spliterator();
        doubleSplit.forEachRemaining((n) -> System.out.println(n));
        ArrayList<Double> sqrtDoubles = new ArrayList<>();
        doubleSplit = doubles.spliterator();
        while(doubleSplit.tryAdvance((n) ->
                sqrtDoubles.add(Math.sqrt(Double.parseDouble(n.toString())))));
        doubleSplit = sqrtDoubles.spliterator();
        doubleSplit.forEachRemaining((n) -> System.out.println(n));
        System.out.println(sqrtDoubles);
    }
}
