public class Toaster extends Appliance{
	public static void main(String[] args){
		Toaster toast = new Toaster();
		toast.turnOn(5);
	}
	public int turnOn(int a){
		System.out.println("Toaster int turnOn");
		return 0;
	}
	
}