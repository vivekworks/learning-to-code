public class MonicaAndRyan implements Runnable{
	BankAccount bankAcc = new BankAccount();
	public static void main(String[] args){
		MonicaAndRyan mAR = new MonicaAndRyan();
		Thread monica = new Thread(mAR);
		Thread ryan = new Thread(mAR);
		monica.setName("Monica");
		ryan.setName("Ryan");
		monica.start();
		ryan.start();
	}

	public void run(){
		System.out.println(Thread.currentThread().getName()+" is called");
		while(bankAcc.getBalance()>0){
			makeWithdrawal(10);
			System.out.println("Balance - "+bankAcc.getBalance());
		}
	}

	public synchronized void makeWithdrawal(int amount){
		System.out.println(Thread.currentThread().getName()+" has entered");
		if(bankAcc.getBalance() >=10){
			System.out.println(Thread.currentThread().getName()+" has checked");
			try{
				System.out.println(Thread.currentThread().getName()+" gonna sleep");
				Thread.sleep(500);
			} catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" is back");
			bankAcc.withdraw(amount);
		} else{
			System.out.println("No Money! No Honey! da");
		}
	}
}