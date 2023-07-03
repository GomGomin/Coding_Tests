import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strarr = s.split("");
        Arrays.sort(strarr);
        StringBuilder sb = new StringBuilder();
        for(String str : strarr){
            sb.append(str);
        }
        return sb.reverse().toString();
    }
}