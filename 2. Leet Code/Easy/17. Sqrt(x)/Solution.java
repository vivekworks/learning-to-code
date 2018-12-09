class Solution{

	public static void main(String[] args){
		Solution solution = new Solution();
		int x = 50058;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 40000;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 500589;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 4;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 25;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 169;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 1000;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 1661521;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 0;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = 1;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
		x = -4234;
		System.out.println("x = "+x+" ; Math.sqrt(x) = "+Math.sqrt(x)+" ; Solution = "+solution.sqrtOf(x));
	}

	public int sqrtOf(int x){                     
		if(x<0) return 0;
		int divisor =0, dividend =0, quotient =0,remainder=0,result =0,begin =0;
		int end = String.valueOf(x).length()%2 == 0 ? 2 : 1;
		for(int i=0;i<(((String.valueOf(x).length())/2) + ((String.valueOf(x).length())%2));i++){
			int j=1;
			dividend = (remainder*100)+Integer.parseInt(String.valueOf(x).substring(begin,end));
			divisor = quotient * 2;
			while(true){
				if((((divisor*10)+j)*j) > dividend)
					break;
				j++;
			}
			divisor = (divisor*10)+(j-1);
			result = (divisor*(j-1));
			quotient = (quotient*10)+(j-1);
			remainder = dividend - result;
			begin = end;
			end = end+2;
		}
		return quotient;
	}        
}