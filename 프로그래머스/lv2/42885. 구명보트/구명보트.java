import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int weigth = 0;
        
        for(int i : people){
            if(weigth + i > limit){
                answer++;
                weigth = 0;
            }
            weigth += i;
        }
        if(weigth != 0){
            answer++;
        }
        return answer;
    }
}