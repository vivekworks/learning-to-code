package challenges;

public class BeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays=0;
        for(int a = i;a<=j;a++){
            StringBuilder sb = new StringBuilder();
            if(Math.abs(a - Integer.parseInt(sb.append(a).reverse().toString()))%k == 0)
                beautifulDays++;
        }
        return beautifulDays;
    }
}
