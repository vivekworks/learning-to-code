package main;

import warmup.*;

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
        int[] apples={3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] oranges={24,48};
        ApplesAndOranges.countApplesAndOranges(7,11,5,15,apples,oranges);
        System.out.println(Kangaroo.kangaroo(0,2,5,3));
        System.out.println(BetweenTwoSets.getTotalX(apples,oranges));
        System.out.println(Arrays.toString(BreakingTheRecords.breakingRecords(apples)));
    }
}
