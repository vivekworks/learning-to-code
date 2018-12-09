public class SimpleDotCom{
	int[] locationCells;
	int numOfHits;

	public String checkYourself(String userInput){
		String result = "Miss";
		int guess = Integer.parseInt(userInput);
				for(int i=0;i<locationCells.length;i++){
					if(locationCells[i]==guess){
						result = "Hit";
						numOfHits++;
						locationCells[i] = -1;
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