package challenges;

public class CatsAndAMouse {
    public static String catAndMouse(int x, int y, int z) {
//        if(Math.abs(x-z) > Math.abs(y-z))
//            return "Cat B";
//        else if(Math.abs(x-z) < Math.abs(y-z))
//            return "Cat A";
//        return "Mouse C";
        return (Math.abs(x-z)==Math.abs(y-z) ? "Mouse C" : (Math.abs(x-z) > Math.abs(y-z) ? "Cat B" : "Cat A"));
    }
}
