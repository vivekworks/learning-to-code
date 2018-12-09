import java.util.ArrayList;
public class DotComBust{
	GameHelper helper = new GameHelper();
	ArrayList<DotCom> dcList = new ArrayList<DotCom>();
	int numOfGuess  =0;
	
	private void setUpGame(){
		DotCom dotCom1 = new DotCom();
		DotCom dotCom2 = new DotCom();
		DotCom dotCom3 = new DotCom();
		dotCom1.setName("Google.com");
		dotCom2.setName("Facebook.com");
		dotCom3.setName("Apple.com");
		dcList.add(dotCom1);
		dcList.add(dotCom2);
		dcList.add(dotCom3);
		ArrayList<String> locArray = new ArrayList<String>();
		for(DotCom dcCell :dcList){
			locArray = helper.placeDotCom(3);
			dcCell.setLocation(locArray);
		}
	}
	private void startPlaying(){
		while(!dcList.isEmpty()){
			String userInput = helper.getUserInput("Enter the user guess");
			checkUserGuess(userInput);
		}
		finishGame();
	}
	private void checkUserGuess(String userInput){
		numOfGuess++;
		String result = "miss";
		for(DotCom dcCell :dcList){
				result = dcCell.checkYourself(userInput);
				if(result != "miss"){
					if(result == "kill"){
						dcList.remove(dcCell);
					}
					break;
				}
			}
			System.out.println(result);
	}
	private void finishGame(){
		System.out.println("All Dot Coms are dead! Your stock is now worthless");
		if(numOfGuess<=18){
			System.out.println("It only took you "+numOfGuess+" numOfGuesses");
			System.out.println("You got out before your options sank");
		} else {
			System.out.println("Took you long enough. "+numOfGuess+" numOfGuesses ");
			System.out.println("Fish are dancing with your options");
		}

	}
	public static void main(String[] args){
		DotComBust bust = new DotComBust();
		bust.setUpGame();
		bust.startPlaying();
	}
}