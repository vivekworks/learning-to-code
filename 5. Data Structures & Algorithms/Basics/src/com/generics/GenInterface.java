package com.generics;

public interface GenInterface<T extends Comparable<T>> {
    T min();
    T max();
}
