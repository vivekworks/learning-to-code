package challenges;


import java.util.Scanner;

public class JavaOutputFormatting {
    public static void formatOutput() {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(s1+getCharacters(15-s1.length(),' ')+getCharacters(3-String.valueOf(x).length(),'0')+x);
        }
        System.out.println("================================");

    }

    private static String getCharacters(int limit,char c){
        StringBuilder emptySpaceBuilder = new StringBuilder("");
        for(int i=0;i<limit;i++)
            emptySpaceBuilder.append(c);
        return emptySpaceBuilder.toString();
    }
}
