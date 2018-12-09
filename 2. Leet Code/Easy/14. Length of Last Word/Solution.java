class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.lengthOfLastWord("a                              "));
	}
	
	public int lengthOfLastWord(String s) {
		System.out.println(s.trim().substring((s.trim().lastIndexOf(' '))+1));
		return ((s == null || s.trim().length() == 0) ? 0 : (s.trim().lastIndexOf(' ') < 0 ? s.trim().length() : (s.trim().substring((s.trim().lastIndexOf(' '))+1)).length()));
    }
}