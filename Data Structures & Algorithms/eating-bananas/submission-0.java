class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int result = Integer.MAX_VALUE,n=piles.length;
        int max = piles[0];
        for(int i=1; i<n; i++){
            max = Math.max(max,piles[i]);
        }

        int l=1, hi=max;
        while(l<=hi){
            int mid = l + (hi-l)/2;
            int temp=0;
            for(int i=0; i<n; i++){
                if(piles[i]%mid == 0)
                    temp+=piles[i]/mid;
                else
                    temp+=(piles[i]/mid + 1);
            }
            if(temp<=h){
                result = Math.min(result,mid);
                hi = mid-1;
            }
            else
                l = mid+1;
        }
        return result;
    }
}
