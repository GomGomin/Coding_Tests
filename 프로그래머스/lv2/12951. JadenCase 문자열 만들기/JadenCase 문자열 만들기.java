class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        char[] chararr = s.toCharArray();
        for(int i=0; i<chararr.length; i++){
            if(i == 0 && chararr[i] >= 65){
                chararr[i]-=32;
            }else if(chararr[i] >= 65 && chararr[i-1] == ' '){
                chararr[i]-=32;
            }
            answer += chararr[i];
        }
        return answer;
    }
}