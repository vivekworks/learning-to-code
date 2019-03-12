package challenges;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        if (year > 1918) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                return "12.09." + year;
            return "13.09." + year;
        } else if (year < 1918) {
            if (year % 4 == 0)
                return "12.09." + year;
            return "13.09." + year;
        }
        return "26.09.1918";
    }
}
