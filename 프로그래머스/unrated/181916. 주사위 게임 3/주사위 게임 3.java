import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Integer[] intarr = {a, b, c, d};
        Arrays.sort(intarr);
        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(intarr));
        if(set.size() == 1){
           return a * 1111;
        }else if(set.size() == 2){
            if(intarr[1] == intarr[2]){
                int n = intarr[1] != intarr[0] ? intarr[0] : intarr[3];
                return (10 * intarr[1] + n) * (10 * intarr[1] + n);
            }else{
                return (intarr[3] + intarr[0]) * (intarr[3] - intarr[0]);
            }
        }else if(set.size() == 3){
            int x = intarr[0];
            for(int i = 1; i<intarr.length; i++){
                if(intarr[i] != intarr[i-1]){
                    x *= intarr[i];
                }else{
                    x /= intarr[i];
                }
            }
            return x;
        }else{
            answer = intarr[0];
        }
        return answer;
    }
}