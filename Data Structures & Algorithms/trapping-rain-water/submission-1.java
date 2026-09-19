class Solution {
    public int trap(int[] h) {
        int n=h.length;
        if(n<=2)
            return 0;

        int l[] = new int[n];
        int r[] = new int[n];
        int le=0, ri=0;
        for(int i=0; i<n; i++){
            le = Math.max(h[i],le);
            l[i] = le;
        }
        for(int i=n-1; i>=0; i--){
            ri = Math.max(h[i],ri);
            r[i] = ri;
        }

        int result=0;
        for(int i=0; i<n; i++){
            result+=(Math.min(l[i],r[i]) - h[i]);
        }
        return result;
    }
}
