import java.util.ArrayList;
public class DotComBust{
	public static void main(String[] args){
		String userInput = null,result = "miss";
		int numOfGuess  =0;
		GameHelper helper = new GameHelper();
		ArrayList<DotCom> dcList = new ArrayList<DotCom>();
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
			locArray = helper.placeDotCom(2);
			dcCell.setLocation(locArray);
		}
		while(true){
			userInput=helper.getUserInput("Enter the user guess");
			numOfGuess++;
			for(DotCom dcCell :dcList){
				result = dcCell.checkYourself(userInput);
				if(result != "miss"){
					if(result == "kill"){
						System.out.println("You've sunk "+dcCell.getName());
						dcList.remove(dcCell);
					}
					break;
				}
			}
			if(dcList.isEmpty()){
				System.out.println("Congratulations! You've sunk them all");
				System.out.println("You've taken "+numOfGuess+" guesses.");
				break;
			}
		}
	}
}