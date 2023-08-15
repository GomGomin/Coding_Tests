import java.util.*;

class Solution {
    boolean solution(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        for(char c : ch){
        count += c == '(' ? 1 : -1; 
            if(count < 0){
                return false;
            }
        }
        if(count != 0){
            return false;
        }
        return true;
    }
}