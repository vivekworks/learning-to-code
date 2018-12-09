class Solution {
	public static void main(String[] args){
		Solution solution = new Solution();
		System.out.println(solution.removeElement(new int[] { 1,1,2,3,4,5,2,1,3},3));
	}
    public int removeElement(int[] nums, int val) {
		if (nums.length == 0) return 0;
        int i=0;
		for(int j=i;j<nums.length;j++){
			if(nums[j] != val){
				nums[i] = nums[j]; 
				i++;
			}
		}
		return i;
    }
}