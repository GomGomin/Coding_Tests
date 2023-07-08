import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] fail = new int[N];
        
        for(int i = 0; i<stages.length; i++){
            if(stages[i] > N){
                continue;
            }
            fail[stages[i]-1]++;
        }
        
        ArrayList<Double> list = new ArrayList<>();
        
        int length = stages.length;
        
        for(int i = 0; i<fail.length; i++){
            if(length == 0){
                list.add((double)0);
            }else{
            list.add((double) fail[i] / length);
            length -=fail[i];
            }
        }
        
        for(int i = 0; i<answer.length; i++){
            answer[i] = list.indexOf(Collections.max(list))+1;
            list.set(list.indexOf(Collections.max(list)),(double)-1);
        }
        
        return answer;
    }
}