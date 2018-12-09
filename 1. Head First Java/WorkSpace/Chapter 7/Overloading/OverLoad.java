public class OverLoad{
	public static void main(String[] args){
		System.out.println("Main");
		OverLoad oL = new OverLoad();
		int a = oL.addNum(2,4);
		System.out.println(a);
		a=oL.addNum(4.5,6.7);
		System.out.println(a);
	}
	public int addNum(int a, int b){
		return (a+b);

	}
	public int addNum(double c, double d){
		return (int)(c+d);
	}
}