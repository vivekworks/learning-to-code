import java.util.*;

class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.romanToInt("X"));
		System.out.println(solution.romanToInt("XCM"));
		System.out.println(solution.romanToInt("MXV"));
		System.out.println(solution.romanToInt("MMM"));
		System.out.println(solution.romanToInt("MVC"));
		System.out.println(solution.romanToInt("V"));
		System.out.println(solution.romanToInt("I"));
		System.out.println(solution.romanToInt("LVIII"));
	}
	
	/*  
		I can be placed before V (5) and X (10) to make 4 and 9. 
		X can be placed before L (50) and C (100) to make 40 and 90. 
		C can be placed before D (500) and M (1000) to make 400 and 900.
	*/
	
	public int romanToInt(String s) {
        HashMap<String, Integer> romanMap = new HashMap<String, Integer>();
		romanMap.put("I",1);
		romanMap.put("V",5);
		romanMap.put("X",10);
		romanMap.put("L",50);
		romanMap.put("C",100);
		romanMap.put("D",500);
		romanMap.put("M",1000);
		String[] romanString = s.split("");
		String prev = null;
		int output = 0;
		for(int i=0;i<romanString.length;i++){
			if(prev == null){
				prev = romanString[i];
			} else{
				if(romanMap.get(prev) >= romanMap.get(romanString[i])){
					output = output + romanMap.get(prev);
					prev = romanString[i];
				} else{
					output = output + (romanMap.get(romanString[i]) - romanMap.get(prev));
					prev = null;
				}
			}
		}
		if(prev != null)
			output = output + romanMap.get(prev);
		
		return output;
    }
}