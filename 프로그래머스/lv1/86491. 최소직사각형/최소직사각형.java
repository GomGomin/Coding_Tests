import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int garo = 0;
        int sero = 0;
        for(int i = 0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            garo = garo < sizes[i][0] ? sizes[i][0] : garo;
            sero = sero < sizes[i][1] ? sizes[i][1] : sero;
        }
        answer =garo * sero;
        return answer;
    }
}