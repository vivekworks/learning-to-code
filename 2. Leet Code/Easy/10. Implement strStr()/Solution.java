import java.util.ArrayList;
class Solution {
	
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println("aabaaabaaac,aabaaac - "+solution.strStr("aabaaabaaac","aabaaac"));
		System.out.println("mississippi,issip - "+solution.strStr("mississippi","issip"));
		System.out.println("mississippi,issipi - "+solution.strStr("mississippi","issipi"));
		System.out.println("missississsisisisisisisisiidfidfsdifsdfaisafiadffajjdfsfjklfjalkfjla,ask - "+solution.strStr("missississsisisisisisisisiidfidfsdifsdfaisafiadffajjdfsfjklfjalkfjla;asklkajdlksjffjsldajflkdjalkfj","ask"));
		System.out.println("a,a - "+solution.strStr("a","a"));
	}

	public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
		if(haystack == null || haystack.length() == 0) return -1;
		if(haystack.length() < needle.length()) return -1;
		ArrayList<Integer> find = new ArrayList<>();
		int pos =-1, var =0, i=0;
		//boolean jReset = false;
		for(int j=0;j<haystack.length();j++){
			if ((haystack.charAt(j) == needle.charAt(0)) && (j != var)) find.add(j);
			if(needle.charAt(i) == haystack.charAt(j)){
				if(i==0) pos = j;
				i++;
			} else{
				i=0;
				j = find.size() > 0 ? find.get(0) - 1 : j;
				var = find.size() > 0 ? find.get(0) : var;
				if(find.size() > 0) find.remove(0);
			}
			if(i>=needle.length()) break; 
		}
		return i == needle.length() ? pos : -1;
	}
	
	
	
    /*public int strStr1(String haystack, String needle) {
        if(needle == null || needle.length() == 0) return 0;
		if(haystack == null || haystack.length() == 0) return -1;
		if(haystack.length() < needle.length()) return -1;
		
        int i=0,temp = 0,op=-1, var =0, old = 0;
		
		for(int j=0;j<haystack.length();j++){
			if (haystack.charAt(j) == needle.charAt(0) && j!= var) var = j;
			if(needle.charAt(i) == haystack.charAt(j)){
				if(i==0) op = j;
				else if(j!=temp+1) op = -1;
				if(i<needle.length()-1){
					i++;
					temp=j;
				}
				else {
					if(j == haystack.length() -1 || i == needle.length()-1) break;
					else {
						i = 0;
						j = var > 0 && old != var ? var-1 : j;
						old = var;
					}
				}
			} else{
				if(j == haystack.length() -1){
					op = -1;
					break;
				} else{
					i = 0;
					j = var > 0   && old != var ? var-1 : j;
					old = var;
					op = -1;
				}
			}
		}
		return op;
    }*/
}