public class HashSetTest{
	String checker;
	public HashSetTest(String hChecker){
		checker = hChecker;
	}

	public static void main(String[] args){
		HashSetTest hsTest1 = new HashSetTest("Charlie");
		HashSetTest hsTest2 = new HashSetTest("Charlie");
		System.out.println(hsTest2.hashCode()+" - "+hsTest1.hashCode());
		hsTest1=hsTest2;
		System.out.println(hsTest2.hashCode()+" - "+hsTest1.hashCode());
	}

	public int hashCode(){
		return checker.hashCode();
	}
}