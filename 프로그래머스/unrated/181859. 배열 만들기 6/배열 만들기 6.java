import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(list.size() == 0){
                list.add(arr[i]);
            }else if(list.get(list.size()-1).intValue() == arr[i]){
                list.remove(list.size()-1);
            }else if(list.get(list.size()-1).intValue() != arr[i]){
                list.add(arr[i]);
            }
        }
        int answer[] = list.stream().mapToInt(i -> i).toArray();
        if(answer.length == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}