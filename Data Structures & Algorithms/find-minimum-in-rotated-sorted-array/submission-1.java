class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int b=0;
        for(int i=0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                // b=i;
                // break;
                return nums[i+1];
            }
        }

        return nums[0];
    }
}
