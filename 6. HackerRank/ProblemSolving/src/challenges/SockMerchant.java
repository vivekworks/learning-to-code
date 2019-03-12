package challenges;

public class SockMerchant {
    public static int sockMerchant(int n, int[] ar) {
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (ar[i] == arr[j] && ar[i] != 0 && arr[j] != 0) {
                    flag = true;
                    arr[j]=0;
                }
            }
            if (flag)
                count++;
            else
                arr[i] = ar[i];
        }
        return count;
    }
}
