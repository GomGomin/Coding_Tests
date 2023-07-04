import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            int[] intarr = new int[commands[i][1] - commands[i][0] + 1];
            for(int j = 0; j<intarr.length; j++){
                intarr[j] = array[j+commands[i][0] -1];
            }
            Arrays.sort(intarr);
            answer[i] = intarr[commands[i][2] -1];
        }
        return answer;
    }
}