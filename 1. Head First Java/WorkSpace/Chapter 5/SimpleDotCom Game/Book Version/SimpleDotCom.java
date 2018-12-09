public class SimpleDotCom{
	int[] locationCells;
	int numOfHits;

	public String checkYourself(String userInput){
		String result = "Miss";
		int guess = Integer.parseInt(userInput);
		for(int cell :locationCells){
			if(cell == guess){
				result = "Hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits==locationCells.length){
			result="Kill";
		}
		System.out.println(result);
		return result;
	}
	public void setLocationCells(int[] locCells){
		locationCells = locCells;
	}
}