public class ThreadsTester{
	public static void main(String[] args){
		ThreadsTester test = new ThreadsTester();
		test.go();
		System.out.println("End of main");
	}

	public void go(){
		Runnable run = new MyRunnable();
		Thread th = new Thread(run);
		th.start();
		System.out.println("End of go");
	}
}