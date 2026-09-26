class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0 || s.length() == 1)
            return s.length();
        LinkedHashSet<Character> ts = new LinkedHashSet<>();
        int n = s.length(),res=0,pre_size=0;
        for(int i=0; i<n; i++){
            if(ts.contains(s.charAt(i))){
                Iterator<Character> itr = ts.iterator();
                while(itr.hasNext()){
                    char ch = itr.next();
                    itr.remove();
                    if(ch == s.charAt(i))
                        break;
                }
            }
            
            ts.add(s.charAt(i));

            res = Math.max(res,ts.size());
        }
        return res;
    }
}
