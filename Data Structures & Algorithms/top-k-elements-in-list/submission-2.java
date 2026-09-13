class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
       
        int res[] = new int[k];
        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i <= nums.length; i++){
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            buckets.get(e.getValue()).add(e.getKey());
        }

        int i = 0;

        for(int j = nums.length; j > 0 && i < k; j--){
            for(int num : buckets.get(j)){
                res[i] = num;
                i++;

                if(i == k)
                    break;
            }
        }

        return res;
    }
}
