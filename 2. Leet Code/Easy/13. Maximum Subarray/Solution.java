class Solution{
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.maxSubArray(new int[] {-45,1,2,-5,0,3,-6,-7,5,-1}));
	}
	
	public int maxSubArray(int[] nums) {
		int sum = 0, max = nums[0];
        for(int i=0;i<nums.length;i++){
			sum=0;
			for(int j=i;j<nums.length;j++){
				sum = sum+nums[j];
				if(max < sum) max = sum;
			}
		}
		return max;
    }
}