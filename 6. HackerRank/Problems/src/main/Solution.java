package main;

import warmup.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args){
        //int[] minMaxArray = {256741038, 623958417, 467905213, 714532089, 938071625};
        //MinMaxSum.miniMaxSum(minMaxArray);
        //System.out.println(TimeConversion.timeConversion("01:00:00PM"));
        //System.out.println(MaximizingXOR.maximizingXor(100,11));
        //int[] grades={73,67,38,33};
        //System.out.println(Arrays.toString(grades));
        //System.out.println(Arrays.toString((GradingStudents.gradingStudents(grades))));
        //int[] apples={3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        //int[] oranges={24,48};
        //ApplesAndOranges.countApplesAndOranges(7,11,5,15,apples,oranges);
        //System.out.println(Kangaroo.kangaroo(0,2,5,3));
        //System.out.println(BetweenTwoSets.getTotalX(apples,oranges));
        //System.out.println(Arrays.toString(BreakingTheRecords.breakingRecords(apples)));
        //List<Integer> list = new ArrayList<>();
        //list.add(1);
        //list.add(2);
        //list.add(1);
        //list.add(3);
        //list.add(2);
        //list.add(1);
        //int[] ar={5,9,10,7,4};
        //System.out.println(Birthday.birthday(list,3,2));
        //System.out.println(DivisibleSumPairs.divisibleSumPairs(5,2,ar));
        /*list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(5);*/
        /*list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        lit.add(4);*/
        //System.out.println(MigratoryBirds.migratoryBirds(list));
        /*System.out.println(DayOfTheProgrammer.dayOfProgrammer(1789));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(1800));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(1900));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(1917));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(1918));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(1919));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(2000));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(2100));
        System.out.println(DayOfTheProgrammer.dayOfProgrammer(2019));*/
        //BonAppetit.bonAppetit(list,2,8);
        //int[] socks={1,2,1,2,1,3,2};
        //System.out.println(SockMerchant.sockMerchant(7,socks));
        /*System.out.println(DrawingClass.pageCount(6,3));
        System.out.println(DrawingClass.pageCount(7,4));
        System.out.println(DrawingClass.pageCount(7,5));
        System.out.println(DrawingClass.pageCount(7,3));
        System.out.println(DrawingClass.pageCount(2,1));
        System.out.println(DrawingClass.pageCount(10,5));*/
        //System.out.println(CountingValleys.countingValleys(8,"UDDDUDUU"));
        //System.out.println(CountingValleys.countingValleys(8,"DDUUUUDD"));
        //System.out.println(CountingValleys.countingValleys(12,"DDUUDDUDUUUD"));
        //System.out.println(ElectronicsShop.getMoneySpent(socks,socks,10));
        //System.out.println(CatsAndAMouse.catAndMouse(1,5,10));
        //int[][] mat = {{4,9,2},{3,5,7},{8,1,5}};
        //System.out.println(FormingAMagicSquare.formingMagicSquare(mat));
        //System.out.println(PickingNumbers.pickingNumbers(list));
        int[] scores={100, 100, 50, 40, 40, 20, 10};
        int[] alice={5, 25, 50, 120};
        int[] steps = ClimbingTheLeaderBoard.climbingLeaderboard(scores,alice);
        System.out.println(Arrays.toString(steps));
        int[] scores2={100, 90, 90, 80, 75, 60};
        int[] alice2={50, 65, 77, 90, 102};
        int[] steps2 = ClimbingTheLeaderBoard.climbingLeaderboard(scores2,alice2);
        //System.out.println(Arrays.toString(steps2));
        System.out.println(Arrays.toString(steps2));
    }
}
