import java.util.*;

class Solution {
    public int solution(String s) {
        ArrayList<String> list = new ArrayList<>();
        
        int count1 = 0;
        int count2 = 0;
        int idx = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(idx); 
            if(ch == s.charAt(i)){
                count1++;
            }else{
                count2++;
            }
            if(count1 == count2){
                list.add(s.substring(idx,i));
                idx = i+1;
                count1 = 0;
                count2 = 0;
            }else if(count1 != count2 && i == s.length()-1){
                list.add(s.substring(idx));
            }
        }
        
        int answer = list.size();

        return answer;
    }
}