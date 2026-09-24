class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        double res[] = new double[n+m];
        int p1=0,p2=0,k=0;
        while (p1 < n && p2 < m) {
    if (nums1[p1] < nums2[p2]) {
        res[k++] = nums1[p1++];
    } else {
        res[k++] = nums2[p2++];
    }
}

while (p1 < n) {
    res[k++] = nums1[p1++];
}

while (p2 < m) {
    res[k++] = nums2[p2++];
}

        if((n+m)%2 == 0)
            return (res[(n+m)/2] + res[(n+m)/2 -1])/2;

        return res[(n+m)/2];
    }
}
