class Solution {
    public String solution(String my_string, int[] indices) {
        String[] arr = my_string.split("");
        for(int i = 0; i<indices.length; i++){
            arr[indices[i]] = "";
        }
        String answer = "";
        for(String str : arr ){
            answer += str;
        }
        return answer;
    }
}