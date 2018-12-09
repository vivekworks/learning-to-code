import java.util.ArrayList;
public class SimpleDotComGame{
	public static void main(String[] args){
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		int randomNum = (int)(Math.random()*5);
		
		ArrayList<Integer> dotComs = new ArrayList<Integer>();
		dotComs.add(randomNum);
		dotComs.add(randomNum+1);
		dotComs.add(randomNum+2);
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		theDotCom.setLocationCells(dotComs);
		boolean isAlive = true;
		while(isAlive){
			String userInput = helper.getUserInput("Enter a number");
			String result = theDotCom.checkYourself(userInput);
			numOfGuesses++;
			if(result=="Kill"){
				isAlive=false;
				System.out.println("Killed");
				System.out.println("Num Of Guesses" +numOfGuesses);
			}
		}
	}
}