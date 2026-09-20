class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(target > matrix[mid][matrix[0].length - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(low>matrix.length-1)
            return false;
        int row = low;
        int p1=0, p2=matrix[row].length-1;
        while(p1<=p2){
            int mid = p1 + (p2-p1)/2;
            if(matrix[row][mid] == target)
                return true;

            if(matrix[row][mid] > target)
                p2=mid-1;
            else
                p1=mid+1;
        }
        return false;
    }
}
