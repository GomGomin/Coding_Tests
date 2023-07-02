class Solution {
    public long solution(long n) {
        long answer = -1;
        int i = 1;
        while(i<=n){
            if((long)Math.pow(i,2) == n){
                answer = (long)Math.pow(i+1,2); 
                break;
            }
            i++;
        }
        return answer;
    }
}