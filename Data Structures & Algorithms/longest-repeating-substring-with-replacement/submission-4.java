class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        // int res =0;

        // for(int i=0; i<n; i++){
        //     int ha[] = new int[26];
        //     int maxi = 0;
        //     for(int j=i; j<n; j++){
        //         ha[s.charAt(j) - 'A']++;
        //         maxi = Math.max(maxi,ha[s.charAt(j) - 'A']);

        //         int changes = (j-i+1) - maxi;
        //         if(changes<=k){
        //             res = Math.max(res,(j-i+1));
        //         }
        //         else
        //             break;
        //     }
        // }
        // return res;


        int l=0,r=0,mf=0,res=0;
        int ha[] = new int[26];

        while(r<n){
            ha[s.charAt(r) - 'A']++;
            mf = Math.max(mf,ha[s.charAt(r) - 'A']);
            //r++;
            if((r-l + 1)-mf >k){
                mf=0;
                ha[s.charAt(l) - 'A']--;
                l++;
                for(int i=0; i<26; i++){
                    mf = Math.max(mf,ha[i]);
                }
            }
            res = Math.max(res,(r-l + 1));
            r++;
        }
        return res;
    }
}
