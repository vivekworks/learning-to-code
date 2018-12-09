class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.reverse(0));
	}
	
	public int reverse(int x) {
		StringBuilder strBuild = new StringBuilder();
		try{
			Integer intObj = new Integer(Math.abs(x));
			System.out.println(intObj);
			strBuild.append(intObj);
			strBuild.reverse();
			strBuild = strBuild.charAt(0) == '0'? strBuild.delete(0,1) : strBuild;
		} catch(Exception e){
			return 0;
		}
		return x > 0 ? Integer.parseInt(strBuild.toString()) : Integer.parseInt(strBuild.toString()) * -1;
    }
}