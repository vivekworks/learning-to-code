import java.util.ArrayList;
public class DotCom{
	private ArrayList<String> location;
	private String name;
	public void setLocation(ArrayList<String> loc){
		location = loc;
	}
	public void setName(String dotComName){
		name = dotComName;
	}
	public String getName(){
		return name;
	}
	public String checkYourself(String userInput){
		int index = location.indexOf(userInput);
		String result = "miss";
		if(index >= 0){
			location.remove(index);
			if(location.isEmpty()){
				result = "kill";
			} else{
				result = "hit";
			}
		}
		System.out.println(result);
		return result;
	}
}