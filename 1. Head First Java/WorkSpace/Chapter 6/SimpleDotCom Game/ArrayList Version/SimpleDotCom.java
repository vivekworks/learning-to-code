import java.util.ArrayList;
public class SimpleDotCom{
	ArrayList<Integer> locationCells;

	public String checkYourself(String userInput){
		String result = "Miss";
		int goo = Integer.parseInt(userInput);
		int index = locationCells.indexOf(goo);
		if(index>=0){
			locationCells.remove(index);
			if(locationCells.isEmpty()){
				result="Kill";
			}
			else{
				result="hit";
			}
		}
		
		System.out.println(result);
		return result;
	}
	public void setLocationCells(ArrayList<Integer> locCells){
		locationCells = locCells;
	}
}