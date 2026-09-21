class Solution {
    public int findMin(int[] nums) {
        // int n = nums.length;
        // int b=0;
        // for(int i=0; i<n-1; i++){
        //     if(nums[i]>nums[i+1]){
        //         return nums[i+1];
        //     }
        // }
        // return nums[0];

        int l=0, h=nums.length-1;
        while(l<h){
            int mid = l + (h-l)/2;

            if(nums[mid]>nums[h])
                l=mid+1;
            else
                h=mid;
        }
        return nums[l];
    }
}