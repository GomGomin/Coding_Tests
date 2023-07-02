import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        if(giulgi(dots[0],dots[1]) == giulgi(dots[2],dots[3])){
            answer = 1;
        }else if(giulgi(dots[0],dots[2]) == giulgi(dots[1],dots[3])){
            answer = 1;
        }else if (giulgi(dots[0],dots[3]) == giulgi(dots[1],dots[2])){
            answer = 1;
        }
        return answer;
    }
    
    public double giulgi(int[] i, int[] j){
        return (double) (i[1]-j[1]) / (i[0]-j[0]);
    } 
    
}

