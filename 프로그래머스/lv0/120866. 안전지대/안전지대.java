class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 1){
                    for(int x = i-1; x<=i+1; x++){
                        if(x >= 0 && x < board.length){
                            for(int y = j-1; y <=j+1; y++){
                                if(y >= 0 && y < board[x].length){
                                if(board[x][y] == 0){
                                board[x][y] = 2;
                                }
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i<board.length; i++){
            for(int j : board[i]){
                if(j == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
}