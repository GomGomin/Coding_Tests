class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int answer1 = numer1 * denom2 + numer2 * denom1;
        int answer2 = denom1 * denom2;
        
        int n = answer1 > answer2 ? answer2 : answer1;
        for(int i = n; i>=1; i--){
            if(answer1 % i == 0 && answer2 % i == 0){
                answer1 /= i;
                answer2 /= i;
                break;
            }
        }
        answer[0] = answer1;
        answer[1] = answer2;
        return answer;
    }
}