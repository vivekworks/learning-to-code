package warmup;

public class JumpingOnTheClouds {
    public static int jumpingOnClouds(int[] c, int k) {
        int i = 0, energy = 100, clen = c.length;
        while (true) {
            if (i != 0 && c[i] == 1)
                energy -= 3;
            else energy--;
            i += k;
            if ((clen - i) < k)
                break;
        }
        energy = energy - ((clen - i) + (c[0] == 1 ? 2 : 0));
        return energy;
    }
}
