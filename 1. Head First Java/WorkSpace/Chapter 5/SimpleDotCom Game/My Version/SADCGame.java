public class SADCGame{
	int hitsCount;
	int[] location;
	public String verifyGuess(int input){
		String result="miss";
		for(int cell :location){
			if(cell==input){
				hitsCount++;
				result="hit";
				break;
			}
		}
		if(hitsCount==location.length)
			result="kill";
		return result;
	}
	public void setLocation(int[] loc){
		location=loc;
	}
}