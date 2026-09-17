class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0)
            return 0;
        else if(nums.length == 1)
            return 1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++)
            hs.add(nums[i]);

        int maxlen = 1;
        for(int i=0; i<nums.length; i++){
            int c=1,k=1;
            if(!hs.contains(nums[i]+1)){
            while(hs.contains(nums[i]-k)){
                k++;
                c++;
            }
            }
            maxlen = Math.max(maxlen,c);
        }
        return maxlen;
    }
}
