class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int p1=0, p2=n-1;
        int result=0;
        while(p1<p2){
            int area = (p2-p1)*Math.min(h[p1], h[p2]);
            if(h[p1]>h[p2])
                p2--;
            else if(h[p1]<h[p2])
                p1++;
            else
                p2--;

            result = Math.max(result,area);
        }

        while(p1<p2){
            int area = (p2-p1)*Math.min(h[p1], h[p2]);
            if(h[p1]>h[p2])
                p2--;
            else if(h[p1]<h[p2])
                p1++;
            else
                p1++;

            result = Math.max(result,area);
        }
        return result;
    }
}
