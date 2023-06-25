import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int a = 1;
        while(a < arr.length){
            a*=2;
        }
        int[] answer = Arrays.copyOfRange(arr,0,a);

        return answer;
    }
}