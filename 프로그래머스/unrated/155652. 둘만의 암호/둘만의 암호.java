import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] ch = s.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            for(int j=0; j<index; j++){
                ch[i]++;
                if(ch[i] > 122){
                    ch[i] -= 26;
                }
                if(skip.contains(String.valueOf(ch[i]))){
                    j--;
                }
            }
        }
        
        for(char c : ch){
            answer += c;
        }
        
        return answer;
    }
}