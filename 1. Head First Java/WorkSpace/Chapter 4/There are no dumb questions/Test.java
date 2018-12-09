class Test{
	public static void main(String[] args){
		Test t = new Test();
		short s = 4;
		t.hey(s);
		s = (short)t.hello();

	}
	void hey(int a){
		System.out.println("a is "+a);
	}
	int hello(){
		return 69;
	}
}