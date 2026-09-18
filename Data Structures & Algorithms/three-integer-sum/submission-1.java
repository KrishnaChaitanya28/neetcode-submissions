class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int p1=i+1, p2=nums.length-1;
            while(p1<p2){
                int n = nums[i] + nums[p1] + nums[p2];
                if(n>0)
                    p2--;
                else if(n<0)
                    p1++;
                else{
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[p1]);
                    temp.add(nums[p2]);

                    res.add(temp);

                    while(p1<p2 && nums[p1]==nums[p1+1])
                        p1++;
                    while(p2>p1 && nums[p2]==nums[p2-1])
                        p2--;
                    p1++;
                    p2--;
                }
            }
        }
        return res;
    }
}
