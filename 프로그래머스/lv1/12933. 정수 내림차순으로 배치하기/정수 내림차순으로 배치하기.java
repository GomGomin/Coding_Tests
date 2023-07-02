import java.util.*;

class Solution {
    public long solution(long n) {
        String[] strarr = String.valueOf(n).split("");
        Arrays.sort(strarr);
        StringBuilder sb = new StringBuilder();
        
        for(String str : strarr){
            sb.append(str);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}