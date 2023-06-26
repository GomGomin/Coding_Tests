class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[board.length];
        for(String str : keyinput){
            switch(str){
                case "left" :
                    if(Math.abs(answer[0]) < board[0] / 2 || answer[0] > 0){
                        answer[0]--;
                    }
                    break;
                case "right" :
                    if(Math.abs(answer[0]) < board[0] / 2 || answer[0] < 0){
                        answer[0]++;
                    }
                    break;
                case "up" :
                    if(Math.abs(answer[1]) < board[1] / 2 || answer[1] < 0){
                        answer[1]++;
                    }
                    break;                
                case "down" :
                    if(Math.abs(answer[1]) < board[1] / 2 || answer[1] > 0){
                        answer[1]--;
                    }
                    break;            }
        }
        return answer;
    }
}