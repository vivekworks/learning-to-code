package main;

import warmup.GradingStudents;
import warmup.MaximizingXOR;
import warmup.MinMaxSum;
import warmup.TimeConversion;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args){
        int[] minMaxArray = {256741038, 623958417, 467905213, 714532089, 938071625};
        MinMaxSum.miniMaxSum(minMaxArray);
        System.out.println(TimeConversion.timeConversion("01:00:00PM"));
        System.out.println(MaximizingXOR.maximizingXor(100,11));
        int[] grades={73,67,38,33};
        System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.toString((GradingStudents.gradingStudents(grades))));
    }
}
