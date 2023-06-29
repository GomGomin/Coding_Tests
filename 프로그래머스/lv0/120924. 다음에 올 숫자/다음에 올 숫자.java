class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int x = common[1] - common[0];
        int n = 0;
        for(int i = 1 ; i<common.length; i++){
            if(x != common[i] - common[i-1]){
                return  common[common.length-1] * (common[i] / common[i-1]);
            }
        }
        answer = common[common.length-1] + x;
        return answer;
    }
}