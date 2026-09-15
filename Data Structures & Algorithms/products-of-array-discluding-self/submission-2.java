class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];

        result[0]=1;
        result[1]=nums[0];

        int temp=nums[n-1];

        for(int i=2; i<n; i++){
            result[i] = result[i-1]*nums[i-1];
        }

        result[n-2] = result[n-2]*nums[n-1];

        for(int i=n-3; i>=0; i--){
            int t = temp*nums[i+1];
            temp=t;
            result[i] = result[i]*t;
        }
        return result;
    }
}  