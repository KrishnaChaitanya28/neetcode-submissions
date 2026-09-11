class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> al;
        for(int i=0; i<strs.length; i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = String.valueOf(ch);
            if(!hm.containsKey(temp)){
                al  = new ArrayList<>();
                al.add(strs[i]);
                hm.put(temp, al);
            }
            else
                hm.get(temp).add(strs[i]);
        }

        for (ArrayList<String> all : hm.values()) {
            res.add(all);
        }
        return res;
    }
}
