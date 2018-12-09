class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.addBinary("1000","1110"));
		System.out.println(solution.addBinary("111111111111000","1110"));
		System.out.println(solution.addBinary("1000","1110111111111111111"));
		System.out.println(solution.addBinary("1","1"));
		System.out.println(solution.addBinary("1","10"));
		System.out.println(solution.addBinary("0","0"));
		System.out.println(solution.addBinary("1","00000"));
		System.out.println(solution.addBinary("0","111111"));
	}
	
	public String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
        int maxLength = a.length() > b.length() ? a.length() : b.length();
		char carry ='0',op = '0';
		for(int i = 0;i<maxLength;i++){
			char aChar = (a.length() -(i+1)) < 0 ? '0' : a.charAt(a.length() -(i+1));
			char bChar = (b.length() -(i+1)) < 0 ? '0' : b.charAt(b.length() -(i+1));
			if(aChar != bChar) {
				op = carry == '0' ? '1' : '0';
				carry = carry == '0' ? '0' : '1';
			} else{
				op = carry == '0' ? '0' : '1';
				carry = aChar == '0' ? '0' : '1';
			}
			sb.append(op);
		}
		sb.append(carry == '1' ? carry : "");
		return String.valueOf(sb.reverse());
    }
}