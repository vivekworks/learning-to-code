public class MyRunnable implements Runnable{
	public void run(){
		System.out.println("Inside Run");
		running();
	}
	public void running(){
		try{
			Thread.sleep(2);
			System.out.println("Inside Running");	
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}