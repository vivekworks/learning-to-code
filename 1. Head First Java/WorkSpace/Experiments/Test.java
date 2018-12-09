public class Test{
	public static void main(String[] args){
		new Test().go();
	}

	void go(){
		char a = '3';
		int b = (int)a;
		System.out.println(a+" - "+Integer.valueOf(b)+" - "+Integer.valueOf(a)+" - "+Character.getNumericValue(a) +" - "+Math.random()*2+" - "+(int)(Math.random()*2));
	}
}