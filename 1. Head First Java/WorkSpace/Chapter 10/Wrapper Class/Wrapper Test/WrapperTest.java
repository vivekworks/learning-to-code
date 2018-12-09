public class WrapperTest{
	public static void main(String[] args){
		int z = 8;
		Integer x = new Integer(z);
		System.out.println(x.intValue());
		byte b = 9;
		Byte s = new Byte(b);
		System.out.println(s.byteValue());
		test(new Integer(7));
	}
	public static void test(int x){
		System.out.println(x);	
	}
}