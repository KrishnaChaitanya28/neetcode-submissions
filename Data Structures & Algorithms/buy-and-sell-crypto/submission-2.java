class Solution {
    public int maxProfit(int[] p) {
        // int n = p.length;
        // int min=p[0], max=p[n-1];
        // int t1[] = new int[n];
        // int t2[] = new int[n];
        // for(int i=0; i<n; i++){
        //     min = Math.min(min,p[i]);
        //     t1[i]=min;
        // }
        // for(int i=n-1; i>=0; i--){
        //     max = Math.max(max,p[i]);
        //     t2[i] = max;
        // }

        // int res=0;
        // for(int i=0; i<n; i++)
        //     res = Math.max(res, t2[i]-t1[i]);

        // return res;


        int n = p.length;
        int min = p[0],res=0;
        for(int i=1; i<n; i++){
            min = Math.min(min,p[i]);
            res = Math.max(res,p[i]-min);
        }
        return res;
    }
}
