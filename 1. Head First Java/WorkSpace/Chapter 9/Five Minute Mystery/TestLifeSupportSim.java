import java.util.ArrayList;
public class TestLifeSupportSim{
	public static void main(String[] args){
		ArrayList aList = new ArrayList();
		for(int z=0;z<20;z++){
			RetentionBot ret = new RetentionBot(aList);
			System.out.println(ret.toString());
		}
	}
}