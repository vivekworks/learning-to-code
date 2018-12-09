import java.lang.*;
public class MyStatic{
	static final int X;
	int x=12;
	final int HELLO;
	static{
		X=14;
	}
	public MyStatic(){
		HELLO = 7;
		
	}
	public MyStatic(int x){
		HELLO = x;
		
		System.out.println("Display");
	}
	public static void main(String[] args){
		MyStatic myS = new MyStatic(78);
		myS.display();
		
	}
	void display(){
		System.out.println("Display - "+X+" hello "+HELLO);
		int a = Math.round(23.555f);
		System.out.println("a "+a);
	}
	public static void go(final int x){
		System.out.println(x);
	}
	public void go1(final int X){
	System.out.println(X);	
	}
}