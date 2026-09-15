class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];

        // for(int i=0; i<n; i++){
        //     int pro = 1;
        //     for(int j=0; j<n; j++){
        //         if(i==j)
        //             continue;

        //         pro*=nums[j];
        //     }
        //     result[i] = pro;
        // }

        int be[] = new int[n];
        int af[] = new int[n];
        be[0]=1;be[1]=nums[0];
        af[n-1] = 1;af[n-2] = nums[n-1];
        for(int i=2; i<n; i++){
            be[i] = be[i-1]*nums[i-1];
        }
        for(int i=n-3; i>=0; i--){
            af[i] = af[i+1]*nums[i+1];
        }

        for(int i=0; i<n; i++)
            result[i] = be[i]*af[i];
        return result;
    }
}  
