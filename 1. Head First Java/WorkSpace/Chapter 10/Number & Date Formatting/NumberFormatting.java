import java.util.Date;
public class NumberFormatting{
	public static void main(String[] args){
		double a = 79788;
		char c='4';
		String s = String.format("My rank is %,.2f",a);
		String z = String.format("My rank is %c",c);
		System.out.println(s+" "+z);
		System.out.println(String.format("two numbers are %d and %<,d",78789));
		Date d = new Date();
		System.out.println(String.format("%tA %<tB %<td",d));
	}
}