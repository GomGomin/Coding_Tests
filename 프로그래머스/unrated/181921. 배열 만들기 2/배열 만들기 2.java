import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int n = 0;
        while(n < r){
            String binary = Integer.toBinaryString(count);
            n = 5 * Integer.parseInt(binary);
            if(n >= l && n <= r){
                list.add(n);
            }
            count++;
        }

        int[] answer = list.stream().mapToInt(i ->i).toArray();
        if(list.isEmpty()){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}