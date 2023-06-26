import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int [queries.length];
        for(int i = 0; i<queries.length; i++){
            int min = 0;
            for(int j = queries[i][0]; j<=queries[i][1]; j++){
                if(queries[i][2] < arr[j] && answer[i] == 0){
                    min = arr[j];
                    answer[i] = arr[j];
                }else if(queries[i][2] < arr[j] && arr[j] < min){
                    min = arr[j];
                    answer[i] = arr[j];
                }                                
            }
            if(answer[i] == 0){
                answer[i] = -1;
            }
        }
        return answer;
    }
}