class Solution {
    public int solution(int n) {
        int answer = n;
        int nBi = Integer.bitCount(n);
        int aBi = 0;
        while(true){
            answer++;
            aBi = Integer.bitCount(answer);
            if(aBi == nBi){
                break;
            }
        }
        return answer;
    }
}