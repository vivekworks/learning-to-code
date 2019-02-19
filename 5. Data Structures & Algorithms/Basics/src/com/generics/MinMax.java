package com.generics;

public class MinMax<T extends Comparable<T>> implements GenInterface<T> {
    T[] nums;

    MinMax(T[] nums) {
        this.nums = nums;
    }

    @Override
    public T min() {
        T min = nums[0];
        for (T val : nums)
            if (val.compareTo(min) < 0)
                min = val;
        return min;
    }

    @Override
    public T max() {
        T max = nums[0];
        for (T val : nums)
            if (val.compareTo(max) > 0)
                max = val;
        return max;
    }
}
