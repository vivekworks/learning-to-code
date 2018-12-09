class Solution{
	
	public static void main(String[] args){
		Solution solution = new Solution();
		int[] a =new int[] {1,1,1,1,1,1,2,1};
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
		
		System.out.println();
		a =new int[] {1,2,3,1,1,1,2,5};
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
		System.out.println();
		a =new int[] {1,1};
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
		System.out.println();
		a =new int[] {};
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
		System.out.println();
		a =new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3};
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
		System.out.println();
		a =new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
		System.out.println();
		a =new int[] {1};
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
		System.out.println();
		System.out.println(solution.removeDuplicates(a));
		for(int num :a)
			System.out.print(num+" ");
	}
	
	
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
	
	/*public int removeDuplicates(int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		if(nums.length == 1) return 1;
		
		int i=0,prev = nums[0],trueRet=0;
		boolean ind,dup=false;
		do{
			ind = false;
			for(int j=i+1;j<nums.length;j++){
				if(nums[j] == nums[i]){
					for(int k=j;k<nums.length-1;k++){
						int temp;
			if(nums[k] == prev){
				temp = nums[k];
				nums[k] = nums[k+1];
				nums[k+1] = temp;
			} else continue;
						
					}
				} else {
					ind = true;
				}
			} 
			if(ind) trueRet++;
			i++;
		} while(i <nums.length);
		return dup ? trueRet : trueRet+1;
    }
	
	/*public int removeDuplicates(int[] nums) {
		
		if(nums == null || nums.length == 0) return 0;
		if(nums.length == 1) return 1;
		if(nums.length == 2) return nums[0] == nums[1] ? 1 : 2;
		int i=0,prev = nums[0];
		do{
			for(int j=i+1;j<nums.length;j++){
				if(nums[j] == nums[i]){
					nums[j] = prev;
				}
			} 
			i++;
		} while(i <nums.length);
		for(int num :nums){
			System.out.print(num+" ");
		}
		i=0;
		do{
		for(int k=1;k<nums.length-1;k++){
			int temp;
			if(nums[k] == prev){
				temp = nums[k];
				nums[k] = nums[k+1];
				nums[k+1] = temp;
			} else continue;
		}
		i++;
		} while(i<nums.length);
		i=1;
			for(int l=1;l<nums.length;l++){
				if(nums[l] != prev) i++;
			}
		return i;
    }*/
}