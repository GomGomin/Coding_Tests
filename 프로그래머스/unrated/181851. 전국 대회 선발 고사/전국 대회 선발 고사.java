import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int mil =10000;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<attendance.length; i++){
            if(attendance[i]){
            list.add(rank[i]);
            }
        }
        int[] a = list.stream().mapToInt(i -> i).sorted().limit(3).toArray();
        
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<rank.length; j++){
                if(a[i] == rank[j]){
                    answer += j * mil;
                    mil /= 100;
                }
            }
        }
        
        return answer;
    }
}