class Solution {
	public static void main(String[] args){
		Solution solution = new Solution();
		int[] op = solution.twoSum(new int[]{2,4,6,7,9,3},1);
		System.out.println(op[0]);
		System.out.println(op[1]);
	}
    public int[] twoSum(int[] nums, int target) {
        int [] output = new int[2];
		boolean ind = false;
		System.out.println(output.length);
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if((i!=j) && (nums[i]+nums[j] == target)){
                    output[0]=i;
                    output[1]=j;
					ind = true;
                    break;
                }
            }
            if(ind){
                break;
            }
        }
        return output;
    }
}