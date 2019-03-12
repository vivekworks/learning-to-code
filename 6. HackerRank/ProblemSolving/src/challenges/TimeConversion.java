package challenges;


public class TimeConversion {
    public static String timeConversion(String s) {
        String[] splitTime = s.split(":");
        splitTime[0] = splitTime[2].indexOf("PM") != -1 ? String.valueOf(Integer.parseInt(splitTime[0]) % 12 + 12) : String.valueOf(Integer.parseInt(splitTime[0]) % 12);
        splitTime[2] = splitTime[2].substring(0, 2);
        return (splitTime[0].length() == 1 ?"0"+splitTime[0] : splitTime[0])  + ":" + splitTime[1] + ":" + splitTime[2];
    }
}
