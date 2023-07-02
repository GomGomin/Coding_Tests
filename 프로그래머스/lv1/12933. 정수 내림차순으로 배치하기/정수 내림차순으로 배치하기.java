import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] strarr = String.valueOf(n).split("");
        Arrays.sort(strarr, Collections.reverseOrder());
        String str = "";
        for(String s : strarr){
            str += s;
        }
        return Long.parseLong(str);
    }
}