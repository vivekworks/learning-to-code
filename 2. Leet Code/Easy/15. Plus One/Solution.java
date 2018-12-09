class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		int[] a = new int[] {1,2,3,4,0};
		a = solution.plusOne(a);
		for(int dig :a) System.out.print(dig);
		System.out.println();
		a = new int[] {0,2,3,4,0};
		a = solution.plusOne(a);
		for(int dig :a) System.out.print(dig);
		System.out.println();
		a = new int[] {0,0,0,0,0};
		a = solution.plusOne(a);
		for(int dig :a) System.out.print(dig);
		System.out.println();
		a = new int[] {1,7,9,8,0};
		a = solution.plusOne(a);
		for(int dig :a) System.out.print(dig);
		System.out.println();
		a = new int[] {9,9,9,9,9};
		a = solution.plusOne(a);
		for(int dig :a) System.out.print(dig);
		System.out.println();
		a = new int[] {9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		a = solution.plusOne(a);
		for(int dig :a) System.out.print(dig);
		System.out.println();
	}
	
	public int[] plusOne(int[] digits) {
		StringBuilder sb = new StringBuilder();
		int plus = 1;
		int i = digits.length-1;
		int b =0;
        do{
			b = i>=0 ? ((digits[i]+plus)/10 > 0 ? (digits[i]+plus)%10 : digits[i]+plus) : plus;
			plus = i>=0 ? ((digits[i]+plus)/10 > 0 ? (digits[i]+plus)/10 :0 ) : 0;
			i--;
			sb.append(b);
		} while((i>=0) || (plus>0));
		sb.reverse();
		int[] op = new int[sb.toString().length()];
		for(int j=0;j<op.length;j++) op[j] = Integer.parseInt(sb.toString().substring(j,j+1));
		return op;
    }
}