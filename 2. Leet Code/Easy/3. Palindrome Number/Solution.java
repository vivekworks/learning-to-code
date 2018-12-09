import java.util.ArrayList;

class Solution {
	
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome(11));
	}
	
    public boolean isPalindrome(int x) {
		ArrayList<Integer> palList = new ArrayList<Integer>();
		int a = x;
		if(a<0){
			return false;
		}
		do{
			palList.add(a%10);
			a = (int)(a/10);
		} while(a>0);
			
		for(int i=0;i<palList.size();i++){
			a = a + (int)(palList.get(i) * Math.pow(10, (palList.size()-1)- i));
		}
		return x==a;
    }
}