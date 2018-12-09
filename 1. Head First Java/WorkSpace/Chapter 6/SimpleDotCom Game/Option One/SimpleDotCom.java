public class SimpleDotCom{
	int[] locationCells;
	int numOfHits;
	int[] hitArray = {-1,-1,-1};

	public String checkYourself(String userInput){
		String result = "Miss";
		boolean acb = false;
		int guess = Integer.parseInt(userInput);
		
		for (int hit :hitArray){
			System.out.println(hit);
			if(hit == guess){
				acb=true;
			}
		}
	
		if(!acb){
		for(int cell :locationCells){
			if(cell == guess){
				result = "Hit";
				numOfHits++;
				
				for (int i=0;i<hitArray.length;i++){
					if(hitArray[i] <= -1){
						hitArray[i] = guess;
						break;
					}
				}
				break;
			}
		}
		if(numOfHits==locationCells.length){
			result="Kill";
		}
		System.out.println(result);
	} else{
		System.out.println("Already came bro");
	}
		return result;
	}
	
	public void setLocationCells(int[] locCells){
		locationCells = locCells;
	}
}