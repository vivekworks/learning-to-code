import java.util.*;
public class SortMountains{
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	
	class NameCompare implements Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			return one.name.compareTo(two.name);
		}
	}

	class HeightCompare implements Comparator<Mountain>{
		public int compare(Mountain one, Mountain two){
			//return (one.height == two.height ? 0 : (one.height > two.height ? -1 : 1));
			return (two.height - one.height);
		}
	}

	public static void main(String[] args){
		new SortMountains().go();
	}

	public void go(){
		mtn.add(new Mountain("Longs",14255));
		mtn.add(new Mountain("Elbert",14433));
		mtn.add(new Mountain("Maroon",14156));
		mtn.add(new Mountain("Castle",14265));
		System.out.println("As Entered :\n"+mtn);
		NameCompare nc = new NameCompare();
		Collections.sort(mtn,nc);
		System.out.println("by Name : \n"+mtn);
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn,hc);
		System.out.println("by Height : \n"+mtn);
	}
}

class Mountain{
	String name;
	int height;
	public Mountain(String mName, int mHeight){
		name = mName;
		height = mHeight;
	}

	public String toString(){
		return name+" "+height;
	}
}