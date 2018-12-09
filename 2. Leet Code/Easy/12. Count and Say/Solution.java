class Solution{
	
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.countAndSay(2));
		System.out.println(solution.countAndSay(0));
		System.out.println(solution.countAndSay(6));
		System.out.println(solution.countAndSay(7));
		System.out.println(solution.countAndSay(8));
		System.out.println(solution.countAndSay(9));
		System.out.println(solution.countAndSay(10));
		
	}
	
	public String countAndSay(int n) {
		if(n == 0) return null;
		if(n == 1) return "1";
        int count=0;
		String old = null, op  ="1";;
		char temp = '1';
		for(int i=1;i<n;i++){
			old = op;
			op= "";
			for(int j=0; j<old.length();j++){
				if(j==0){
					temp =old.charAt(0);
					count++;
				}
				else{
					if(temp != old.charAt(j)){
						op = op+count+temp;
						temp = old.charAt(j);
						count =1;
					} else count++;
				}
			}
			op = op+count+temp;
			count=0;
		}
		return op;
    }
}