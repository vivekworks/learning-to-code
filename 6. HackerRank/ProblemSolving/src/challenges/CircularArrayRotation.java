package challenges;



public class CircularArrayRotation {
    public static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] answers = new int[queries.length];
        for (int i = 0, n = queries.length, l = a.length; i < n; i++)
            answers[i] = a[(l+queries[i]-(k%l))%l];
        return answers;
    }
}