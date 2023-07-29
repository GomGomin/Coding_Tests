import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] number = new int[arr.length];
        for(int i=0; i<number.length; i++){
            number[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(number);
        String answer = number[0]+" "+number[number.length-1];
        return answer;
    }
}