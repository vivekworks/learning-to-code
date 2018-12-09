public class TwoThreads implements Runnable{
	public static void main(String[] args){
		Runnable runner = new TwoThreads();
		Thread oneTh = new Thread(runner);
		Thread twoTh = new Thread(runner);
		oneTh.setName("A");
		twoTh.setName("B");
		oneTh.start();
		twoTh.start();
	}

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}