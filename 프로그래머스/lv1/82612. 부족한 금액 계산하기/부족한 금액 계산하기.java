class Solution {
    public long solution(int price, int money, int count) {
        long n = 0;
        for(int i = 1; i<=count; i++){
            n += (long)price*i;
        }
        long answer = n - (long)money > 0 ? n - (long)money : 0;
            
        return answer;
    }
}