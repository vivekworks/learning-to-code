public class Finally{
	public static void main(String[] args){
		Finally fina = new Finally();
		boolean returnType = fina.check();
		System.out.println("returnType - "+returnType);
		fina.checking();
	}
	public boolean check() throws Exception{
		try{
			System.out.println("Inside Try");
			throw new Exception();
			//return true;
		} finally{
			System.out.println("Inside Finally");
			return true;
		}
	}
	void checking(){
		try{
			System.out.println("Hey Try");
			check();
		} finally{
			System.out.println("Hey Finally");
		}
	}
}