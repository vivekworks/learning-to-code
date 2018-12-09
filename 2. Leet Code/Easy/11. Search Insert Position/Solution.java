class Solution {
	
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.searchInsert(new int[] {1,2,3,4,9},5));
	}
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
		int i=0;
		for(i= (nums[((nums.length - 1))/2] > target ? 0 : ((nums.length - 1)/2)) ; i < (nums[(nums.length - 1)/2] > target ?  (nums.length)/2 : nums.length);i++){
			if(nums [i] >= target)
				break;
		}
		return i;
    }
}