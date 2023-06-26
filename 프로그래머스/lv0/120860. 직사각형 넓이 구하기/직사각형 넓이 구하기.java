class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int h = 0;
        int w = 0;
        for(int i = 1; i<dots.length; i++){
            if(dots[0][0] != dots[i][0]){
                h = Math.abs(dots[0][0] - dots[i][0]);
            }
            if(dots[0][1] != dots[i][1]){
                w = Math.abs(dots[0][1] - dots[i][1]);
            }
        }
        answer = h*w;
        return answer;
    }
}