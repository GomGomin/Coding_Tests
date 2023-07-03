class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(c == ' '){
                answer += c;
            }else if(c < 97){
                answer += c + n > 'Z' ? (char)(c + n - 26) : (char)(c + n);
            }else{
                answer += c + n > 'z'? (char)(c + n - 26) : (char)(c + n);
            }
        }
        return answer;
    }
}