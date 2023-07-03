class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            int n = 1;
            int count = 0;
            while(n <= i){
                if(i % n == 0){
                    count++;
                }
                n++;
            }
            answer += count % 2 == 0 ? i : -i;
        }
        return answer;
    }
}