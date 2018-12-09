public class TreeSetTest{
	String checker;
	public TreeSetTest(String tChecker){
		checker = tChecker;
	}

	public static void main(String[] args){
		TreeSetTest tsTest1 = new TreeSetTest("Charlie");
		TreeSetTest tsTest2 = new TreeSetTest("Charlie");
		System.out.println(tsTest2.hashCode()+" - "+tsTest1.hashCode());
		tsTest1=tsTest2;
		System.out.println(tsTest2.hashCode()+" - "+tsTest1.hashCode());
	}

	public int hashCode(){
		return checker.hashCode();
	}
}