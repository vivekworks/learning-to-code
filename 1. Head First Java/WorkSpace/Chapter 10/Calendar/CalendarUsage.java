import java.util.Calendar;
public class CalendarUsage{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(2018,3,1,20,5);
		System.out.println(c.get(c.ZONE_OFFSET));
		System.out.println(c.getTimeInMillis());
		c.setTimeInMillis(c.getTimeInMillis()+50000);
		System.out.println(c.getTimeInMillis());
		c.add(c.DATE,23);
		System.out.println(c.getTime());
		c.add(c.WEEK_OF_YEAR,8);
		System.out.println(c.getTime());
		c.roll(c.WEEK_OF_YEAR,50);
		System.out.println(c.getTime());
		c.set(c.DATE,25);
		System.out.println(c.getTime());
		System.out.println(c.get(c.DAY_OF_MONTH));
	}
}