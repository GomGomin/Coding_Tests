import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<score.length; i++){
            if(i<k){
                list.add(score[i]);
                Collections.sort(list,Collections.reverseOrder());
                answer[i] = list.get(list.size()-1).intValue();
            }else{
                list.add(score[i]);
                Collections.sort(list,Collections.reverseOrder());
                answer[i] = list.get(k-1).intValue();
            }
            
        }
        return answer;
    }
}