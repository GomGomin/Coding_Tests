class Solution {
    public String solution(int q, int r, String code) {
        String[] arr = code.split("");
        String answer = "";
        for(int i = 0; i<arr.length-1; i+=q){
            answer += arr[i+r];
        }
        return answer;
    }
}