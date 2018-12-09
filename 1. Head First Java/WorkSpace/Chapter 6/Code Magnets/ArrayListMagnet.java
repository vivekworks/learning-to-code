import java.util.*;
public class ArrayListMagnet{
	public static void printAL(ArrayList<String> a1){
		for(String element :a1){
			System.out.print(element+" ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		ArrayList<String> a = new ArrayList<String>();
		a.add(0,"Zero");
		a.add(1,"One");
		a.add(2,"Two");
		a.add(3,"Three");
		printAL(a);
		a.remove(2);
		if(a.contains("Two")){
			a.add("2.2");
		}
		if(a.contains("Three")){
			a.add("Four");
		}
		printAL(a);
		if(a.indexOf("Four") != 4){
			a.add(4,"4.2");
		}
		printAL(a);
		printAL(a);
	}
}