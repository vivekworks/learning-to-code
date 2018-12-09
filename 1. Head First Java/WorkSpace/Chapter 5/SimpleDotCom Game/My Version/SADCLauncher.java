public class SADCLauncher{
	public static void main(String[] args){
		String userGuess=null,result=null;
		int intGuess=0,trial=0,random=0;
		random=(int)Math.random()*5;
		SADCGame game = new SADCGame();
		GameHelper helper=new GameHelper();
		int [] locationNo = {random,random+1,random+2};
		game.setLocation(locationNo);
		while(true){
			userGuess=helper.getUserInput("Enter the Guess ");
			intGuess=Integer.parseInt(userGuess);
			result=game.verifyGuess(intGuess);
			trial++;
			System.out.println(result);
			if(result=="kill"){
				System.out.println("Sank");
				break;
			}
		}
		System.out.println("Guesses "+trial);
	}
}