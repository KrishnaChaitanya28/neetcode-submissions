class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res[] = new int[2];
        hm.put(nums[0],0);
        for(int i=1; i<nums.length; i++){
            int k = target - nums[i];
            if(hm.containsKey(k))
            {
                res[0] = hm.get(k);
                res[1] = i;
                return res;
            }
            else
                hm.put(nums[i],i);
        }
        return res;
    }
}
