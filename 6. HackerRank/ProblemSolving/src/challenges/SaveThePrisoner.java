package challenges;

public class SaveThePrisoner {
    public static int saveThePrisoner(int n, int m, int s) {
        int position=(s-1)+(m-n);
        position= position> 0 ? position : n+position;
        return position%n == 0 ? n : position%n;
    }
}
