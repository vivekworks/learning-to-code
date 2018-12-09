class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.climbStairs(Integer.MAX_VALUE));
	}
	
	public int climbStairs(int n) {
		int result = 0,prev = 0, next = 1;
		for(int i=0;i<n;i++){
			result = next+prev;
			prev = next;
			next = result;
		}
		return result;
	}
}