class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling){
            String[] x = str.split("aya|ye|woo|ma");
            if(x.length == 0){
                answer++;
            }
        }
        return answer;
    }
}