import java.util.*;
class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println("( "+solution.isValid("("));
		System.out.println(") "+solution.isValid(")"));
		System.out.println("{ "+solution.isValid("{"));
		System.out.println("} "+solution.isValid("}"));
		System.out.println("[ "+solution.isValid("["));
		System.out.println("] "+solution.isValid("]"));
		System.out.println("() "+solution.isValid("()"));
		System.out.println("{} "+solution.isValid("{}"));
		System.out.println("[] "+solution.isValid("[]"));
		System.out.println("{()} "+solution.isValid("{()}"));
		System.out.println("[{()}] "+solution.isValid("[{()}]"));
		System.out.println("[(){}] "+solution.isValid("[(){}]"));
		System.out.println(" "+solution.isValid(""));
		System.out.println("(}] "+solution.isValid("(}]"));
		System.out.println("[}{] "+solution.isValid("[}{]"));
		System.out.println("(){}[] "+solution.isValid("(){}[]"));
		System.out.println("](){} "+solution.isValid("](){}"));
		System.out.println("{{{{}}}} "+solution.isValid("{{{{}}}}"));
		System.out.println("{[}]}} "+solution.isValid("{[}]}}"));
		System.out.println("{[()][]} "+solution.isValid("{[()][]}"));
		System.out.println("}}}}}} "+solution.isValid("}}}}}}"));
		System.out.println("[[[[[[[[ "+solution.isValid("[[[[[[[["));
		System.out.println("(()( "+solution.isValid("(()("));
	}
	
	/*public boolean isValid(String s) {
		if(s.length() <= 0) return true;
		if(s.length()%2 == 1) return false;
		StringBuilder strBuild = new StringBuilder(s);
		while(true){
			int count=0;
			for(int i=0; i<strBuild.length();i++){
				if(braceIntValue(strBuild.charAt(i)) < 0){
					if(i != 0){
						if(braceIntValue(strBuild.charAt(i)) + braceIntValue(strBuild.charAt(i-1)) == 0){
							strBuild.deleteCharAt(i);
							strBuild.deleteCharAt(i-1);
							count+=1;
							break;
						} else{
							return false;
						}
					} else{
						return false;
					}
				} 
			}
			if (count <= 0) return false;
			if(strBuild.length() <= 0) return true;
		}
	}
	
	int braceIntValue(char c){
		switch(c){
			case '(' : return 1;
			case ')' : return -1;
			case '{' : return 2;
			case '}' : return -2;
			case '[' : return 3;
			case ']' : return -3;
			default  : return 0;
		}
	}
	*/
	
	public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
        
}