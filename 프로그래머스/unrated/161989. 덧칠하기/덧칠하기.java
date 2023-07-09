class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int idx = section[0];
        for(int i = 1; i<section.length; i++){
            if(idx + m - 1< section[i]){
                idx = section[i];
                answer++;
            }
        }
        return answer;
    }
}