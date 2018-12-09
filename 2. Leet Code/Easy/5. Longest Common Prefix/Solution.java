import java.util.*;
class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		Calendar calendar = Calendar.getInstance();
		System.out.println(solution.longestCommonPrefix(new String[]{"aa"}));
	}
	
	public String longestCommonPrefix(String[] strs) {
		boolean looping = true;
		int i=0;
		int minLength = Integer.MAX_VALUE;
		StringBuilder outputBuilder = new StringBuilder();
		String temp =null;
		if(strs.length >0){
			for(String word :strs){
				if(word.length() < minLength){
					minLength = word.length();
					temp = word;
				}
			}
			char[] firstOneArray = temp.toCharArray();
			while(looping){
				if(i < minLength){
					outputBuilder.append(firstOneArray[i]);
					for(int j=0;j<strs.length;j++){
						if(strs[j].charAt(i) != firstOneArray[i]){
							looping = false;
							outputBuilder.deleteCharAt(i);
							break;
						}				
					}
					i++;
				} else{
					looping = false;
				}
			}
		}
		return outputBuilder.toString();
    }
}