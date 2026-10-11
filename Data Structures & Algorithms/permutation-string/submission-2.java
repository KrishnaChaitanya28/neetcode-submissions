class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length(), m = s2.length();
        if(n>m)
            return false;
        char ch[] = s1.toCharArray();
        Arrays.sort(ch);

        for(int i=0; i<=m-n; i++){
            char temp[] = new char[n];
            int t=0;
            for(int j=i; j<i+n; j++){
                temp[t] = s2.charAt(j);
                t++; 
            }
            Arrays.sort(temp);

            if(Arrays.equals(temp,ch))
                return true;
        }
        return false;
    }
}
