class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length-1, m=matrix.length-1;
        int row=-1;
        for(int i=0; i<=m; i++){
            if(target<=matrix[i][n]){
                row = i;
                break;
            }
        }
        if(row==-1)
            return false;
        int p1=0, p2=matrix[0].length-1;
        while(p1<=p2){
            int mid = p1 + (p2-p1)/2;
            if(matrix[row][mid] == target)
                return true;

            if(matrix[row][mid] > target)
                p2--;
            else
                p1++;
        }
        return false;
    }
}
