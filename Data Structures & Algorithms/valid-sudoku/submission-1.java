class Solution {
    public boolean isValidSudoku(char[][] board) {        
        for(int i=0; i<9; i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[i][j]=='.')
                    continue;
                if(hs.contains(board[i][j]))
                    return false;
                
                hs.add(board[i][j]);
            }
        }

        for(int i=0; i<9; i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=0; j<9; j++){
                if(board[j][i]=='.')
                    continue;
                if(hs.contains(board[j][i]))
                    return false;
                
                hs.add(board[j][i]);
            }
        }

        for(int i=0; i<9; i+=3){
            for(int j=0; j<9; j+=3){
                if(!valid(i,j,board))
                    return false;
            }
        }

        return true;
    }

    boolean valid(int st, int en, char[][] b){
        HashSet<Character> hs = new HashSet<>();
        for(int i=st; i<=st+2; i++){
            for(int j=en; j<=en+2; j++){
                if(b[i][j] == '.')
                    continue;

                if(hs.contains(b[i][j]))
                    return false;
                
                hs.add(b[i][j]);
            }
        }
        return true;
    }
}
